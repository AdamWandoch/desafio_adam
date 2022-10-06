package src;

import java.util.Arrays;

public class Tarefa1 {
    public static void main(String[] args) {
//        instantiate and initialize originalArray[],
        int[] originalArray = {7, 5, 3, 9, 6, 4, 1};
//        instantiate and initialize newArray[] based on originalArray[] filtering where value IS NOT EQUAL to 4 using Java Arrays API,
        int[] newArray = Arrays.stream(originalArray).filter(value -> value != 4).toArray();
//        in newArray[] replace values of 9 with 5,
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 9) newArray[i] = 5;
        }
//        initialize sum variable and assign with the value of sum of items in newArray[]
        int sum = Arrays.stream(newArray).sum();
//        print originalArray[] to the screen,
        System.out.println("originalArray: ");
        printArray(originalArray);
//        print newArray[] to the screen,
        System.out.println("newArray: ");
        printArray(newArray);
//        print the sum variable.
        System.out.println("Sum of items in newArray: " + sum);
    }

    private static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }
}
