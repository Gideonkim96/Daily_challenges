/*
Challenge 9: Find the Factorial of a Number Without Recursion
Problem:
//        Write a Java program that:
//        Takes a positive integer n
//        Calculates the factorial of n using a loop (no recursion)
//        Prints the result
 */


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int number = scanner.nextInt();

//        int number = 5;
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long factorial=1;
        for( int i=1 ; i<= number; i++ ){
            factorial *=i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
