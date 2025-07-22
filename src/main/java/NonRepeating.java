/*
Challenge 8: Find the First Non-Repeating Character in a String
Problem:
        Write a Java program that:
        Takes a string input
        Finds and prints the first character that does not repeat in the string
        If all characters are repeated, print "No unique character found"

 */


public class NonRepeating {
    public static void main(String[] args) {
        String input= "aabbcc";
        String word =input.toLowerCase();

        for ( char c: word.toCharArray()){
            int count =0;
            for (char ch: word.toCharArray()){
                if (c == ch) {
                    count++;
                }
            }
            if (count ==1){
                System.out.println("Non Repeating letter Found "+ c);
                break;
            }else if(count <=2 ) {
                System.out.println("No Non repeating letter found!!");
                break;
            }
        }
    }
}

/*
public class NonRepeating {
    public static void main(String[] args) {
        String input = "aabbcc";
        String word = input.toLowerCase();
        boolean found = false;

        for (char c : word.toCharArray()) {
            int count = 0;
            for (char ch : word.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating character is: " + c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No unique character found.");
        }
    }
}

 */