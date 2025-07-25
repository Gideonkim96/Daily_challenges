/*
🔹 Challenge 20: Convert Roman Numerals to Integer
        🧠 Problem:
        Write a Java method that converts a Roman numeral string into its integer value.
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String input = "MCMXCIV";
        System.out.println(romanToInt(input));

    }
    public static int romanToInt(String s){
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result =0;
        int prevValue =0;

        for (int i=s.length() -1; i>=0; i--){
            char c =s.charAt(i);
            int currentValue = values[c - 'A'];
            if (currentValue < prevValue){
                result -=currentValue;
            }else {
                result += currentValue;
            }
            prevValue=currentValue;
        }

        return result;

    }

}
