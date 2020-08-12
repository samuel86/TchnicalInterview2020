package afamousInterviewsQ.aggregateFunctions;

public class FindTheMaximum {
    /**
     * 1.Create a main method
     * 2.Create my own custom method
     * 3.Call the custom method in the main method
     * @param args
     */
    public static void main(String[] args) {
        FindTheMaximum maxi = new FindTheMaximum();
        int[] myArray ={23, 92, 56, 39, 93, 121, 999};
        System.out.println("Maximum array is ::" + maxi.max(myArray));

    }
    public int max(int[] array){
        int max =0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}
