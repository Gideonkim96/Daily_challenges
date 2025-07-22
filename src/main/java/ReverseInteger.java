/*
Challenge 10: Reverse an Integer
Problem:
        Write a Java program that:
        Takes a positive integer input
        Reverses the digits of the number
        Prints the reversed number
 */


import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int number = scanner.nextInt();
        String strNumber = String.valueOf(number);
        StringBuilder reverseNumber = new StringBuilder(strNumber);
        reverseNumber.reverse();

        System.out.println("The reverse of the number is "+ reverseNumber);

    }
}
/*
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println("The reversed number is " + reversed);
    }
}
 */