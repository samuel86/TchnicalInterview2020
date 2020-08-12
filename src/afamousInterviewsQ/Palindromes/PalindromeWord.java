package afamousInterviewsQ.Palindromes;

public class PalindromeWord {
    /**
     * Check if is palindrome
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalin("Woow"));

    }

    /**
     * Calling the charAt()
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str){

        int head = 0;
        int tail = str.length()-1;
        while (head < tail){
            if (str.charAt(head) != str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;



    }

public static boolean isPalin(String word){
        if (word == null)
            return false;
        StringBuilder build = new StringBuilder(word);
        return  build.reverse().toString().equals(word);
}
}
