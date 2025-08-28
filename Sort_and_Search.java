 
package Lec6_array;
  import java.util.Arrays;
import java.util.Scanner;
public class Sort_and_Search { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
                System.out.println("Nhap 5 so nguyen:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("So " + x + " nam o vi tri index = " + index);
        else
            System.out.println("Khong tim thay so " + x);
    }
}
