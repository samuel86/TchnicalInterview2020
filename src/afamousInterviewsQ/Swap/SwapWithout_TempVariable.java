package afamousInterviewsQ.Swap;

public class SwapWithout_TempVariable {
    public static void main(String[] args) {


        int a = 20;
        int b = 30;

        System.out.println("a value before swapping: " + a);
        System.out.println("b value before swapping: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a value after swapping: " + a);
        System.out.println("b value after swapping: " + b);






    }

}
