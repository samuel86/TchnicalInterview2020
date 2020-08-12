package afamousInterviewsQ.Removes;

import java.util.Arrays;

public class Remove_Duplicate {

    public static void main(String[] args) {
       Integer arr[] = {7, 4, 5, 9, 2, 3, 5, 3, 8};
       removeDup(arr);
        System.out.println("\n============");
        String str[] = {"Sammy", "krishna", "kumar", "kumar", "sakinala", "krishna", };
        removeDup(str);

    }
    private static void removeDup(Object[] objects){
        Arrays.stream(objects).distinct().forEach(element -> System.out.print(element + " "));
    }
}
