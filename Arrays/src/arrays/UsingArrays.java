package arrays;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");
        }

        System.exit(0);

        int[] newArray = {1, 2, 3, 4, 5};
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }
        Object[] objectArray =  new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray; //nested array

    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
