package afamousInterviewsQ.aggregateFunctions;

import java.util.Scanner;

public class  FindTheSum {
    public static void main(String[] args) {

        int sum = 0;

        for (int num = 0; num <= 5; num++ ){
            sum += num;
        }
        System.out.println("Sum: " + sum);




        System.out.println("==============");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Second number");
        int num2 = scan.nextInt();

        int sum1 = num1 + num2;
        System.out.println("sum1 = " + sum1);

    }
}
