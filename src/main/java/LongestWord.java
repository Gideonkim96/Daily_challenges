/*
✅ Updated Challenge 15: Find the Longest Word in a Sentence
            📌 Problem Statement:
            Write a Java program that:
            Takes a sentence as input from the user.
            Splits the sentence into words.
            Finds and prints the longest word and its length.
 */


import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TYPE YOUR SENTENCE: ");
        String input= scanner.nextLine();
        String[] words = input.split("[^a-zA-Z0-9]+");
        String longestWord ="";
        int maxLength =0;


        for (String word : words) {
            if (word.length() > maxLength){
             maxLength = word.length();
             longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length: " + maxLength);
    }
}
