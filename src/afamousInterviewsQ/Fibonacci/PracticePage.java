package afamousInterviewsQ.Fibonacci;

public class PracticePage {

    public static void main(String[] args) {

        //Finding the first 10 Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 2; i <= 10; i++){
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(nextTerm + " ");

            System.out.println();



    }


    }
}
