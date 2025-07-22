import java.util.Arrays;

public class Tall {
    public static int tallest(int[] arr){
//        int tall= arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>tall){
//                tall=arr[i];
//            }
//        }
//        return tall;
        int tall =arr[0];
        Arrays.sort(arr);
        return tall;
    }
    public static void main(String[] args){
        int[] arr= {2,3,3,44,54,5,};
        System.out.println(tallest(arr));
    }
}

