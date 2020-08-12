package afamousInterviewsQ.Palindromes;

public class PalindromeNumberCheck {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1234567890));
    }
    public static boolean isPalindrome(long num){
        long remain = num;
        long rev = 0;

        while (remain !=0 ){
            long digit = remain % 10;
            rev = rev * 10 + digit;
            remain /= 10;
        }
        return num == rev;
    }
}
