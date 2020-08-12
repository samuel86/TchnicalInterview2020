package afamousInterviewsQ.Others;

public class Armstrong {
    /**
     * A number is called an Armstrong number
     * if it is equal to sum of its digits each
     * raised to the power of number of digits in it.
     * Ex: 153, 371, 407, 9474
     * 153 = 1^3 + 5^3 + 3^3
     *       1   + 125  + 27 = 153
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        int digit;
        int temp = 0;
        int number = 370;

        while (temp > 0){
            digit = temp %10;
            sum = sum + (digit * digit * digit);
            temp = temp/10;
            
        }
        if (number == sum){
            System.out.println(number + " is an armstrong number");
        }else { 
            System.out.println(number + " is an not armstrong number");
        }
        System.out.println(isArmstrong(365));
    }
    /*
    153 = 1^3 + 5^3 + 3^3 == 153

     */
    public static boolean isArmstrong(int num){
        int digit = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        while (digit != 0){
            int each = digit % 10;
            digit /= 10;
            sum += Math.pow(each , power);
        }
        return sum == num;
    }

}
