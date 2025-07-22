//Write a Java function that takes an array of integers and returns the largest number in the array.


public class Tallest {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,1};
        System.out.println(findTallest(arr));
    }

   public static int findTallest(int[] arr){
    int max= arr[0];
    for (int i=0; i<arr.length; i++){
        if (arr[i]>max){
            max=arr[i];
        }
    }
    return max;
   }
}