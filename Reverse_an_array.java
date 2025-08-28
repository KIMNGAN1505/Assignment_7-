
package Lec6_array;
import java.util.Arrays;
public class Reverse_an_array {
    
    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};
        System.out.println("Mang ban dau: " + Arrays.toString(numbers));
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println("Mang sau khi dao nguoc: " + Arrays.toString(numbers));
    }
}
