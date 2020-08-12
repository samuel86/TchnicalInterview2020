package afamousInterviewsQ.Others;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};

        int[] b = {1, 3, 5, 4};

        if (Arrays.equals(a,b)){
            System.out.println("Both are Equal");
        }else {
            System.out.println("Both are not Equal");
        }
    }
}
