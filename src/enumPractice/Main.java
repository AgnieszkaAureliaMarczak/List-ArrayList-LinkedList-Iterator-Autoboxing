package enumPractice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }

        System.exit(0);

        DayOfWeek weekDay = DayOfWeek.TUE;
        System.out.println(weekDay);
        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            switchDayOfWeek(weekDay);
        }

        Kolor kolor = Kolor.CZERWONY;
        System.out.println("kolor czerwony jest " + czyLadny(kolor));
    }

    public static String czyLadny(Kolor kolor) {
        return kolor.isLadny() ? "ladny" : "brzydki";
    }

    public static DayOfWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch(weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }
}
