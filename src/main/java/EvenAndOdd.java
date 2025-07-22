/*
    Challenge 5: Sum of Even and Odd Numbers
    Problem:
    Write a Java program that:
    Takes an array of integers
    Calculates and prints the sum of even numbers
    Calculates and prints the sum of odd numbers
 */


public class EvenAndOdd {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,7,8,9,10};
        int evenSum =0;
        int oddSum =0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("The sum of even number is " + evenSum);
        System.out.println("The sum of odd number is " + oddSum);

    }
}
