/*Encrypt a string by repeating i-th character i times
Given string str, the task is to encrypt the string with the given encryption algorithm. The 1st character of the string will be repeated once in the encrypted string, the 2nd character will be repeated twice, …, nth character will be repeated n times. 
Examples: 
Input: str = "geeks" 
Output: geeeeekkkksssss
 */
import java.util.*;
public class Prog19b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++)
                ans += str.charAt(i);
        }
        System.out.println(ans);
    }
}
