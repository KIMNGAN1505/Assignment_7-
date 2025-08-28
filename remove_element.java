 
package Lec6_array;
 import java.util.ArrayList;
import java.util.Arrays;

public class remove_element {
    
    public static void removeGreaterThan50(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) list.remove(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 60, 25, 80, 5, 95));
        System.out.println("Ban dau: " + list);
        removeGreaterThan50(list);
        System.out.println("Sau khi xoa > 50: " + list);
    }
}


