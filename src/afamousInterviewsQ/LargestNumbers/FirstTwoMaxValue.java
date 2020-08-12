package afamousInterviewsQ.LargestNumbers;

import java.util.Arrays;

public class FirstTwoMaxValue {
    public static void main(String[] args) {
        int[] arr = {5, 6, 10, 45, 2, 70};

        getMaxValues(arr);

    }

    public static void getMaxValues(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        Arrays.sort(nums);
        System.out.println("Max1: " + (nums[nums.length - 1]));
        System.out.println("Max2: " + (nums[nums.length - 2]));

    }
}