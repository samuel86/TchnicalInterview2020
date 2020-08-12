package afamousInterviewsQ.aggregateFunctions;

public class PrimeNumber {
    public static void main(String[] args) {
          primeNum(100);
        System.out.println("\n-==========");
        System.out.println(checkPrime(35));
        System.out.println("======");
          printAllTo(23);

    }
//======================================================
    public static void primeNum(int num){
        for (int i = 2; i <= num ; i++) {
            if (i%2 == 1){
                System.out.print(i + " ");
            }
        }

    }
//======================================================
    public static boolean checkPrime(int n ){
        if (n <= 1){
            return false;
        }
        for (int j = 2; j < Math.sqrt(n) ; j++) {
            if (n % j ==0){
                return false;
            }

        }
        return true;

    }
//======================================================
    public static void printAllTo(int num){
        for (int i = 2; i <= num ; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }
    public static boolean isPrime(int number){
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
