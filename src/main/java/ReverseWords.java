/*
🧠 Challenge 17: Reverse Each Word in a Sentence
                🧩 Problem:
                Write a Java program that:
                Takes a sentence input from the user.
                Reverses each word individually.
                Keeps the word order the same.
                Prints the new sentence.
 */


import java.util.Scanner;


public class ReverseWords {
    public static void main(String[] args) {
//        String input = "Hello World from Java";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            String reversewords = new StringBuilder(word).reverse().toString();
            result.append(reversewords).append(" ");
        }

        System.out.println("Reversed sentence: " + result.toString().trim());
    }
}
