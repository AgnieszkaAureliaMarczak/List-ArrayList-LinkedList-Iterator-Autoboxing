package arrays;

public class VarArgs {
    public static void main(String... args) {
        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");
    }

    private static void printText(String... textList){
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
