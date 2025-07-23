/*
🧠 Challenge 12: Find the Second-Largest Number in an Array
Problem:
            Write a Java program that:
            Takes an array of integers
            Finds and prints the second-largest number in the array
            If there is no second largest (e.g. all elements are the same), print "No second-largest number found"
 */


import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20,20, 8, 20};
//        int[] arr = {3,3,3,3,3};
        Arrays.sort(arr);

        int n = arr.length;
        boolean found = false;
        for (int i =n-2; i>=0 ; i--){
            if (arr[i] != arr[n-1]){
                System.out.println("This is the second largest number: " + arr[i]);
                found =true;
                break;
            }
        }
        if (!found){
            System.out.println("Second largest number was not found!");
        }

    }
}

/*
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
//        int[] arr = {3, 3, 3, 3};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second-largest number found!");
        } else {
            System.out.println("This is the second largest number: " + secondMax);
        }
    }
}
 */
