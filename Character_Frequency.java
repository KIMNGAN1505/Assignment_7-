 
package Lec6_array;
 
public class Character_Frequency {
     public static void main(String[] args) {
        String text = "hello world";
        int[] freq = new int[26];

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        System.out.println("Tan suat xuat hien:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + freq[i]);
            }
        }
    }
}

