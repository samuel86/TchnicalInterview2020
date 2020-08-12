package afamousInterviewsQ.Swap;

public class Swap_Two_Numbers {

    public static void main(String[] args) {
        int a = 234;
        int b = 3456;
        System.out.println("Before swapping: " + a);
        System.out.println("Before swapping: " + b);

        int c = a;
         a = b;
         b = c;

        System.out.println("After swapping: " + a);
        System.out.println("After swapping: " + b);

        // a = a^b^ (b = a);

    }
}
