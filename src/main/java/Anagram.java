/*
Challenge 18 (New & Unique): Group Words That Are Anagrams
            🧠 Problem:
            Given an array of strings, group the words that are anagrams of each other.
            Return a List<List<String>>, where each inner list contains grouped anagrams.
 */

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] words = {"bat", "tab", "cat", "act", "tac", "dog"};
        List<List<String>> result = groupAnagrams(words);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagram = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!anagram.containsKey(sorted)){
                anagram.put(sorted,new ArrayList<>());
            }
            anagram.get(sorted).add(word);

        }
        return new ArrayList<>(anagram.values());
    }
}