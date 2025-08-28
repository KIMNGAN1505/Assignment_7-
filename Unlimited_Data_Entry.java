 
package Lec6_array;
  import java.util.ArrayList;
import java.util.Scanner;

public class Unlimited_Data_Entry {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Nhap cac so nguyen (nhap -1 de dung):");
        int sum = 0;

        while (true) {
            int x = sc.nextInt();

            if (x == -1) {
                break;             }

            numbers.add(x); 
            sum += x;       
        }

        System.out.println("Danh sach vua nhap: " + numbers);
        System.out.println("Tong cac so = " + sum);

    }
}


