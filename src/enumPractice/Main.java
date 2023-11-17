package enumPractice;

public class Main {
    public static void main(String[] args) {
        Kolor kolor = Kolor.CZERWONY;
        System.out.println("kolor czerwony jest " + czyLadny(kolor));
    }

    public static String czyLadny(Kolor kolor){
        return kolor.isLadny() ? "ladny" : "brzydki";
    }
}
