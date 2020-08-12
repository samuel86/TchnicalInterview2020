package afamousInterviewsQ.LargestNumbers;

import java.util.Arrays;

public class PracticesPage {

    public static void main(String[] args) {
        int[] arr = {23, 45, 70, 21, 80};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);

        int number = Arrays.stream(arr).max().getAsInt();
        System.out.println(number);
    }
}
