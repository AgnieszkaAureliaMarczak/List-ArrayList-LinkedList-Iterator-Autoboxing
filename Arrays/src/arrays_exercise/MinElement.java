package arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int numberOfElements = readInteger();
        int[] userArray = readElements(numberOfElements);
        System.out.println(Arrays.toString(userArray));
        System.out.println(findMin(userArray));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe integerow:");
        return scanner.nextInt();
    }

    private static int[] readElements(int numberOfElements) {
        int[] arrayOfIntegers = new int[numberOfElements];
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz liczby:");
        for (int i = 0; i < numberOfElements; i++) {
            arrayOfIntegers[i] = sc.nextInt();
        }
        return arrayOfIntegers;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
