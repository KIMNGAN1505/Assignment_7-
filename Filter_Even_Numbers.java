 
package Lec6_array;
  import java.util.ArrayList;
import java.util.Scanner;
public class Filter_Even_Numbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua danh sach: ");
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Nhap cac so nguyen:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println("Danh sach so chan: " + evenNumbers);

    }
}


