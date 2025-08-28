 
package Lec6_array;
     import java.util.Arrays;

public class Swap_two_elements {
 
     public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        swap(arr, 0, 2);
        System.out.println("Sau khi doi cho: " + Arrays.toString(arr));
    }
}

