package linkedLists;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
};

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit1 = new LinkedList<>();
        addPlace(placesToVisit1,new Place("Adelaide", 1374));
        addPlace(placesToVisit1,new Place("Alice Springs", 2771));
        addPlace(placesToVisit1,new Place("Brisbane", 917));
        addPlace(placesToVisit1,new Place("Darwin", 3972));
        addPlace(placesToVisit1,new Place("Melbourne", 877));
        addPlace(placesToVisit1,new Place("Perth", 3923));
        addPlace(placesToVisit1,new Place("Sydney", 0));
        System.out.println(placesToVisit1);

        Scanner scanner = new Scanner(System.in);
        var iterator = placesToVisit1.listIterator();
        boolean quitLoop = false;
        boolean forward = true;
        printOptions();
        while(!quitLoop){
            if (!iterator.hasPrevious()){
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch(menuItem){
                case "F" -> {
                    System.out.println("User wants to go forward");
                    if (!forward){ //Reversing Direction
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next(); // Adjust position forward
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("User wants to go backward");
                    if (forward){ //Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous(); // Adjust position backwards
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> printOptions();
                case "L" -> System.out.println(placesToVisit1);
                default -> quitLoop = true;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if (list.contains(place)) {
            System.out.println("This town is already in the itinerary");
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("This town is already in the itinerary");
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printOptions() {
        String textBlock = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
    }
}

