package afamousInterviewsQ.Removes;

public class RemoveSpaces {
    public static void main(String[] args) {

        String word = "  Love Your Neighbor As Yourself  ";
        word = word.replaceAll("\\s+", "");
        System.out.println(word);
    }
}
