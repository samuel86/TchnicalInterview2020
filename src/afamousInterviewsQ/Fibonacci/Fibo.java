package afamousInterviewsQ.Fibonacci;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive number :");
        int inputNumber = scan.nextInt();
        int firstTerm = 0;

        int secondTerm = 1;

        int thirdTerm = 0;


        while (thirdTerm < inputNumber){
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        if (thirdTerm == inputNumber){
            System.out.println("Number belong to Fibonacci series");
        }else{
            System.out.println("Number doesn't belong to Fibonacci series");
        }







    }
}
