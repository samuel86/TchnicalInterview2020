package afamousInterviewsQ.Others;

public class Anagram {
    /**
     * This is when a character of first string is present in second string.
     * If it present, we remove that character from second string and proceed
     * to next character. If any character of first string is not present in
     * second string, we break the loop and conclude that string are not anagrams.
     * @param args
     */
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }
        for (int i = 0; i < a.length() ; i++) {
            b = b.replaceFirst(a.charAt(i) + "", "");

        }
        if (b.isEmpty()){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
