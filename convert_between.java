
package Lec6_array;
 import java.util.ArrayList;
import java.util.Arrays;

public class convert_between {
    
    public static ArrayList<String> arrayToArrayList(String[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list = arrayToArrayList(arr);
        System.out.println("Array -> ArrayList: " + list);

        String[] back = arrayListToArray(list);
        System.out.println("ArrayList -> Array: " + Arrays.toString(back));
    }
}

