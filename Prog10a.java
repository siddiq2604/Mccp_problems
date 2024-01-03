/*
 * Pangram is a sentence containing every letter in the English alphabet. Given a string, find all characters that are missing from the string, i.e., the characters that can make the string a Pangram. We need to print output in alphabetic order.
Examples: 
Input : welcome to geeksforgeeks
Output : abdhijnpquvxyz

 */
import java.util.*;
public class Prog10a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
                        String str = sc.nextLine();
                        str = str.toLowerCase();
                        int[] arr = new int[26];
                        for (int i = 0; i < str.length(); i++) {
                            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                                arr[str.charAt(i) - 'a']++;
                            }
                        }
                        boolean flag = true;
                        for (int i = 0; i < 26; i++) {
                            if (arr[i] == 0) {
                                flag = false;
                                System.out.print((char)(i + 'a') + " ");
                            }
                        }
        }
}
