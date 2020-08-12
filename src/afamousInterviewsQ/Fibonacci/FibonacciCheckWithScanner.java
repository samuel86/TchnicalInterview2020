package afamousInterviewsQ.Fibonacci;
import java.util.*;
public class FibonacciCheckWithScanner {
    /**
     * Fibonacci series is a series of numbers where each number is obtained
     * by adding two previous numbers. The first two numbers in the Fibonacci series
     * are either 1 and 0 or 0 and 1
     * Example: 0, 1, 1, 2, 3, 5, 9, 13, 21, 34, 55, 89,....
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Positive Number :");
        int inputNumber = scan.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;

        while (thirdTerm < inputNumber) {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        if(thirdTerm == inputNumber){
            System.out.println("Number belongs to Fibonacci series");
        }else {
            System.out.println("Number does not belongs to Fibonacci series");
        }

    }
}
