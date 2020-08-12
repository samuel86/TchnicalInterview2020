package afamousInterviewsQ.Palindromes;

public class MakingItPalindrome {

    public static void main(String[] args) {

        String word = "Anna";
        System.out.println(word);
        word = word.toLowerCase();
        System.out.println(word);
        word = word.replace(" ", "");
        System.out.println(word);
        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
            reversed += word.charAt(i);
        }
        System.out.println("\nreversed =" + reversed);
        if (word.equals(reversed)){
            System.out.println(word + " is palindrome");
        }else {
            System.out.println(word + " is not palindrome");
        }
        System.out.println("===================================");

        String word1 = "Anna";
        String reversed1 = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
            reversed1 += word.charAt(i);
        }
        System.out.println("\nreversed =" + reversed1);
        if (word.equals(reversed1)){
            System.out.println(word + " is palindrome");
        }else {
            System.out.println(word + " is not palindrome");
        }
    }
}
