package afamousInterviewsQ.aggregateFunctions;

public class practice {
    public static void main(String[] args) {

        String sentence = "Java is fun. Java is the best";
        int java  = 0;

        sentence = sentence.toLowerCase();
        while(sentence.contains("java")){
            java++;
            sentence = sentence.replaceFirst("java", "");
        }
        System.out.println("Number of java is : " + java );
    }
}
