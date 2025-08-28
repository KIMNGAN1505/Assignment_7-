
package Lec6_array;
   import java.util.ArrayList;
import java.util.Scanner;


public class List_Management {
  
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Them cong viec");
            System.out.println("2. Xem danh sach cong viec");
            System.out.println("3. Xoa cong viec theo vi tri");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int choice = sc.nextInt();
            sc.nextLine(); 
            if (choice == 0) {
                break; 
            } else if (choice == 1) {
                System.out.print("Nhap ten cong viec: ");
                String task = sc.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("Danh sach rong!");
                } else {
                    System.out.println("Danh sach cong viec:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 3) {
                System.out.print("Nhap vi tri can xoa: ");
                int index = sc.nextInt() - 1; 
                if (index >= 0 && index < tasks.size()) {
                    tasks.remove(index);
                    System.out.println("Da xoa!");
                } else {
                    System.out.println("Vi tri khong hop le!");
                }
            } else {
                System.out.println("Lua chon khong hop le!");
            }
        }

    }
}


