package afamousInterviewsQ.LargestNumbers;

import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {5, 6, 10, 45, 2, 70};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[arr.length-3]);


    }
}
