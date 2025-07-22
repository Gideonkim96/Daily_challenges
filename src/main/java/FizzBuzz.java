/*
Write a Java program that prints numbers from 1 to 100, but:
    For multiples of 3, print "Fizz" instead of the number.
    For multiples of 5, print "Buzz" instead of the number.
    For numbers which are multiples of both 3 and 5, print "FizzBuzz".
*/

public class FizzBuzz {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        multiple(numbers);
    }

    public static int[] multiple(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 3 == 0 && num[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (num[i] % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num[i]);
            }

        }
        return num;

    }
}
