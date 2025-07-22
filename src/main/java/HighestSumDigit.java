/*
Challenge 6: Find the Number with the Highest Sum of Digits
Problem:
Given an array of positive integers, write a Java program to:
Find the number that has the highest sum of its digits.
If there are multiple numbers with the same digit sum, pick the largest number among them.
 */


public class HighestSumDigit {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 99, 101};
        int maxDigitSum = -1;
        int resultNumber = -1;

        for (int num : arr) {
            int currentDigitSum = sumOfDigits(num);

            if (currentDigitSum > maxDigitSum) {
                maxDigitSum = currentDigitSum;
                resultNumber = num;
            } else if (currentDigitSum == maxDigitSum) {
                if (num > resultNumber) {
                    resultNumber = num;
                }
            }
        }

        System.out.println("Number with highest digit sum is: " + resultNumber);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;   // Get last digit
            num = num / 10;    // Remove last digit
        }
        return sum;
    }
}


// 12 = 4+4+4
// 23 =