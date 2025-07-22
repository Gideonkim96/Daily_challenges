/*
Challenge 7: Find All Prime Numbers in a Range
Problem:
        Write a Java program that:
        Takes two integers start and end
        Prints all prime numbers between start and end (inclusive)
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        boolean foundPrime = false;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            System.out.println("NO PRIME NUMBER FOUND");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

