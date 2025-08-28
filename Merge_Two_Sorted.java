 
package Lec6_array;
     import java.util.Arrays;

public class Merge_Two_Sorted {

     public static int[] mergeSorted(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) result[k++] = a[i++];
            else result[k++] = b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6};
        int[] b = {2, 3, 5};
        System.out.println("Mang sau khi tron: " + Arrays.toString(mergeSorted(a, b)));
    }
}

