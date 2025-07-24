/*
🧠 Challenge 16: Rotate an Array
            🧩 Problem:
            Write a Java program that:
            Takes an array of integers and a number k
            Rotates the array to the right by k steps
            Prints the rotated array
 */


import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Handle cases where k is larger than array length
        k = k % arr.length;

        int[] rotatepart = Arrays.copyOfRange(arr,arr.length-k, arr.length);
        int[] part = new int[arr.length];

        System.arraycopy(rotatepart,0,part,0,rotatepart.length);
        System.arraycopy(arr,0,part,k,arr.length-k );

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Rotated array:  " + Arrays.toString(part));

    }
}
