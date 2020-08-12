package afamousInterviewsQ.aggregateFunctions;

public class FindTheMinimum {
    /**
     * 1.Create a main method
     * 2.Create my own custom method
     * 3.Call the custom method in the main method
     *
     * @param args
     */
    public static void main(String[] args) {
        FindTheMinimum minn = new FindTheMinimum();
        int[] myArray = {23, 92, 56, 39, 93, 121, 999};
        System.out.println("Minimum array is ::" + minn.min(myArray));

    }

    public int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }
}