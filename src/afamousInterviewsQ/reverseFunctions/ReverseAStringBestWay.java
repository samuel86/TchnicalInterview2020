package afamousInterviewsQ.reverseFunctions;

public class ReverseAStringBestWay {
    public static void main(String[] args) {
        String name = "Samuel Osei";
        String reverse = new StringBuffer(name).reverse().toString();
        System.out.println(reverse);
    }
}
