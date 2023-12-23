package arrays_challenge;

import arrays.UsingArrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] unsortedArray = UsingArrays.getRandomArray(11);
        System.out.println(Arrays.toString(unsortedArray));

        int[] reversedArray = sortInReversedOrder(unsortedArray);
        System.out.println(Arrays.toString(reversedArray));
        System.exit(0);

        int[] copyOfMyArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(copyOfMyArray);
        reverseArray(copyOfMyArray);
        System.out.println(Arrays.toString(copyOfMyArray));
    }

    private static int[] sortInReversedOrder(int[] arrayToSort) {
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

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}


