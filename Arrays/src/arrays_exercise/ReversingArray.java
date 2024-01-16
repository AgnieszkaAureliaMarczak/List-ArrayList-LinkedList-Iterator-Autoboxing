package arrays_exercise;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] myNumbers = {9, -4, 6, 47, 55, 36};
        reverse(myNumbers);
    }
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}


