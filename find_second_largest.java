 
package Lec6_array;
 
public class find_second_largest {
    public static Integer secondLargest(int[] arr) {
        if (arr.length < 2) return null;
        Integer largest = null, second = null;
        for (int v : arr) {
            if (largest == null || v > largest) {
                second = largest;
                largest = v;
            } else if (v != largest && (second == null || v > second)) {
                second = v;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 20};
        System.out.println("So lon thu 2 la: " + secondLargest(arr));
    }
}

