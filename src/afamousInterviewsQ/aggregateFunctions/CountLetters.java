package afamousInterviewsQ.aggregateFunctions;

public class CountLetters {
    public static void main(String[] args) {

        //Counting number of letters in a work

        String word = "java";
        String check = "";

        for (int i = 0; i < word.length(); i++){
            if(check.contains(word.charAt(i) + "")) continue;
            int count = 0;

            for (int j = 0; j < word.length(); j++){
                if (word.charAt(i) == word.charAt(j)) count++;
            }
            System.out.println(word.charAt(i) + " - " + count);
            check += word.charAt(i);
        }
    }
}
