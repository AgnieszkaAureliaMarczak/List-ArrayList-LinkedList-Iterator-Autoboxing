package arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] usersArray = getIntegers(5);
        int[] sortedArray = sortIntegers(usersArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] usersArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            usersArray[i] = scanner.nextInt();
        }
        return usersArray;
    }

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int temp;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 1; j < sortedArray.length - i; j++)
                if (sortedArray[j] > sortedArray[j - 1]) {
                    temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
        }
        return sortedArray;
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }
}

