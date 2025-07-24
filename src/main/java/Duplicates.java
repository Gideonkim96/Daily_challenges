/*
🧠 Challenge 14: Remove Duplicates from an Array
        🧩 Problem:
        Write a Java program that:
        Takes an array of integers (e.g., {1, 2, 3, 2, 4, 1, 5})
        Removes the duplicate elements
        Prints the array without duplicates
         */


import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Integers");
//        int[] arr = scanner.nextLine();
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int length = arr.length;

        for(int i=0;i< length; i++) {
            for (int j=0; j< length; j++){
                if (arr[i]==arr[j]){
                    for (int k =j; k< length-1; k++){
                        arr[k]= arr[k+ 1];
                    }
                    length--;
                    j--;
                }
            }
        }
        int[] uniqueArray = new int[length];
        System.arraycopy(arr, 0, uniqueArray, 0, length);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}

//correct
/*
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int n = arr.length;

        int[] temp = new int[n];
        int newLength = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newLength++] = arr[i];
            }
        }

        int[] uniqueArray = Arrays.copyOf(temp, newLength);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}

 */