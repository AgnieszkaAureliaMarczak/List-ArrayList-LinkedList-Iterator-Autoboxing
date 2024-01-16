package arrays_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        int min = findMin(array);
        System.out.println(min);
    }

    private static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String userInput = sc.nextLine();
        String[] inputAsStrings = userInput.split(",");
        int[] intArray = new int[inputAsStrings.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(inputAsStrings[i].trim());
        }
        return intArray;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
