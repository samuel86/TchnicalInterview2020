package afamousInterviewsQ.aggregateFunctions;

public class SumOfAllDigits {
    public static void main(String[] args) {
      /*
      Given number = 1356
      Sum of all Given Digits : 1 + 3 + 5 + 6 = 15
       */
        int number = 1356;
        int sum = 0;
        while (number > 0){
            sum += number %10;
            number = number / 10;

        }
        System.out.println(sum);
    }
}
