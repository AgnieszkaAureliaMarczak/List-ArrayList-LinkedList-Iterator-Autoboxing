package arrays_challenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myNumbers = {9, -4, 6, 47, 55, 36};
        System.out.println(Arrays.toString(myNumbers));
        reverseArray(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
    }

    private static void reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el; // dekrementacja nastepuje po przypisaniu
        }
        return reversedArray;
    }
}
