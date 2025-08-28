 
package Lec6_array;
import java.util.ArrayList;
import java.util.Arrays;
public class Remove_Duplicate_Elements {
    public static ArrayList<Integer> xoaTrungLap(ArrayList<Integer> list) {
        ArrayList<Integer> ketQua = new ArrayList<>();
        for (Integer x : list) {
            if (!ketQua.contains(x)) { 
                ketQua.add(x); 
            }
        }
        return ketQua;
    }
    public static void main(String[] args) {
        ArrayList<Integer> dauVao = new ArrayList<>(Arrays.asList(1, 3, 2, 1, 4, 3, 5));
        ArrayList<Integer> dauRa = xoaTrungLap(dauVao);

        System.out.println("Danh sach ban dau: " + dauVao);
        System.out.println("Danh sach sau khi xoa trung lap: " + dauRa);
    }
}