package afamousInterviewsQ.aggregateFunctions;

public class CountJava {
    public static void main(String[] args) {
        //Find the number of java count in the sentence
        String sentence = "Java is fun. Java is the best";
        int java = 0;

        sentence = sentence.toLowerCase();

        while (sentence.contains("java")){
            java++;
            sentence = sentence.replaceFirst("java", "");
        }
        System.out.println("Number of java count is : " + java);
    }
}
