
package Lec6_array;
    import java.util.Scanner;
public class Count_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                count++;
            }
        }

        System.out.println("So " + x + " xuat hien " + count + " lan.");

    }
}
