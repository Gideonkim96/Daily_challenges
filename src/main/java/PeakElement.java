/*
🔹 Challenge 19: Find the Peak Element in an Array
            🧠 Problem:
            A peak element is one that is greater than its neighbors.
            Write a Java method to find any one peak element’s index in a given array.
            Assume nums[i] ≠ nums[i + 1] and the array contains at least one pea
 */



public class PeakElement {
    public static void main(String[] args) {
        int[] nums ={1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element index: " + peakIndex + ", value: " + nums[peakIndex]);
    }
    public static int findPeakElement(int[] nums){
        if (nums == null || nums.length==0){
            return -1;
        }
        if (nums.length == 1){
            return 0;
        }

        if (nums[0] > nums[1]){
            return 0;
        }
        if (nums[nums.length - 1]> nums[nums.length -2]){
            return nums.length - 1;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        return -1;

    }

}
