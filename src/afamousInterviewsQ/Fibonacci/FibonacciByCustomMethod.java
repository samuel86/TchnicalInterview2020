package afamousInterviewsQ.Fibonacci;

public class FibonacciByCustomMethod {
    public static void main(String[] args) {

        fibonacci(10);
    }

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.println(a + " " + b);

        for (int i = 2; i <= num; i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);
        }
    }
}