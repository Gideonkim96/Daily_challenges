/*
🧠 Challenge 13: Advanced Palindrome Checker
            Problem:
            Write a Java program that:
            Takes a sentence as input
            Removes all spaces and punctuation
            Ignores case
            Checks if the cleaned string is a palindrome
            Prints "Palindrome" or "Not a palindrome"
 */

import java.util.Scanner;

public class SentencePalindrome {
    public static void main(String[] args) {
//        String input = "A man, a plan, a canal, Panama";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        String input = scanner.nextLine();

        input = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean result = input.equals(new StringBuilder(input).reverse().toString());
        if (result){
            System.out.println("It is palindrome");
        }else {
            System.out.println("It is not palindrome");
        }
//        System.out.println(result ? "Palindrome" : "Not a palindrome");
    }
}
