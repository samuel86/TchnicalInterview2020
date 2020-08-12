package afamousInterviewsQ.Others;

public class NumberOfWordsInAString {
    public static void main(String[] args) {
        String sentence = "Love your neighbor as yourself";
        String words[] = sentence.split(" ");
        System.out.println(words.length);
    }
}
