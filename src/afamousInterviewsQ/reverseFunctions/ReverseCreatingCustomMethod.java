package afamousInterviewsQ.reverseFunctions;

public class ReverseCreatingCustomMethod {
    public static void main(String[] args) {
        String s = "I Love Java";
        String reversed = "";
        for (int j = s.length()-1; j >=0 ; j--) {
            reversed = reversed + s.charAt(j);
        }
        System.out.println(reversed);



        System.out.println(reverseString("Samuel"));
    }
    public static String reverseString(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
