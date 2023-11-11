package arrayLists.challenegs;

import java.util.*;

public class myArray {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag =  true;
        while (flag){
            printActions();
            switch (scanner.nextInt()) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void printActions() {
        String textBlock = """
                Select an option from the below:
             
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) (separate items by comma]:");
        scanner.nextLine();
        String[] itemsToAdd = scanner.nextLine().split(",");
        for (String s : itemsToAdd) {
            String trimmed = s.trim();
            if (!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) (separate items by comma]:");
        scanner.nextLine();
        String[] itemsToRemove = scanner.nextLine().split(",");
        for (String i : itemsToRemove) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }
}
