// Write a Java function that checks if a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward (ignoring spaces and case).

public class Palidrome {
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Check if the string is equal to its reverse
        return input.equals(new StringBuilder(input).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "racecar";
        boolean result = isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
