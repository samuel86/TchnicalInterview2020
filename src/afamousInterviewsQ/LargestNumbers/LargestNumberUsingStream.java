package afamousInterviewsQ.LargestNumbers;

import java.util.Arrays;

public class LargestNumberUsingStream {

    public static void main(String[] args) {

        int [] array = {1, 5, 7, 234, 745, 98, 287,1927};
        int maxNumber = Arrays.stream(array).max().getAsInt();
        System.out.println("The Largest number is: " + maxNumber);
        int minNumber = Arrays.stream(array).min().getAsInt();
        System.out.println("The minimum number is: " +minNumber);
    }
}
