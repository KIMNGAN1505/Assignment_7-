 
package Lec6_array;
     import java.util.Arrays;

public class Concatenate_Two {
    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) result[i] = a1[i];
        for (int j = 0; j < a2.length; j++) result[a1.length + j] = a2[j];
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] result = concatenate(a1, a2);
        System.out.println("Ket qua noi mang: " + Arrays.toString(result));
    }
}

