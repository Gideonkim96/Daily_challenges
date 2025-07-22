/*Problem:
Write a Java function that takes a string and returns the number of vowels in it.
    Vowels to count:
     a, e, i, o, u (both uppercase and lowercase)

 */

public class CountVowel {
    public static void main(String[] args){
       String input = "java";
       String word = input.toLowerCase();
       String[] vowels = {"a","e","i","o","u"};
       int count = 0;
       for(char c : word.toCharArray()){
           for( String vowel : vowels){
               if(String.valueOf(c).equals(vowel)){
                   count++;
               }
           }
       }

        System.out.println("The number of vowels is " + count);


    }
}
