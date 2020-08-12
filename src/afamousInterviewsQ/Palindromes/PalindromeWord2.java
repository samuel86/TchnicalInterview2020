package afamousInterviewsQ.Palindromes;

public class PalindromeWord2 {
    public static void main(String[] args) {
         String str = "Anna";
         boolean check = true;

         for (int i = 0; i < str.length()/2; i++){
             if (str.charAt(i) != str.charAt(str.length() -1 -i)){
                 check = false;
                 break;
             }
         }
         if (check){
             System.out.println("Palindrome");
         }else{
             System.out.println("Not Palindrome");
         }

    }


}
