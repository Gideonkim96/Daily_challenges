/*
🧠 Challenge 11: Count Digits, Letters, and Special Characters
            Problem:
            Write a Java program that:
            Takes a string input.
            Counts the number of:
            Alphabetic letters (a–z, A–Z)
            Digits (0–9)
            Special characters (e.g., @, #, $, !, etc.)
            Prints the counts.
 */


import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input: " );
        String input = scanner.nextLine();


        String[] letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String[] digits = "0123456789".split("");
        String[] specialChars = "!@#$%^&*()_+-=[]{}|;':,.<>?".split("");

        int coletter=0;
        int codigit=0;
        int cospecial=0;

        for (char c: input.toCharArray()){
            for (String letter: letters ){
                if (String.valueOf(c).equals(letter)){
                    coletter++;
                }
            }
            for (String digit: digits ){
                if (String.valueOf(c).equals(digit)){
                    codigit++;
                }
            }
            for (String specialChar: specialChars ){
                if (String.valueOf(c).equals(specialChar)){
                    cospecial++;
                }
            }


        }
        System.out.println("No of letter "+ coletter);
        System.out.println("No of digit " + codigit);
        System.out.println("No of SpecialChars " + cospecial);

    }
}

/*
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = scanner.nextLine();

        int countLetters = 0;
        int countDigits = 0;
        int countSpecial = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                countLetters++;
            } else if (Character.isDigit(c)) {
                countDigits++;
            } else if (!Character.isWhitespace(c)) {
                countSpecial++;
            }
        }

        System.out.println("Number of letters: " + countLetters);
        System.out.println("Number of digits: " + countDigits);
        System.out.println("Number of special characters: " + countSpecial);
    }
}

 */
