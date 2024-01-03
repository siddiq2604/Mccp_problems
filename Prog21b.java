/*Given a string, check if it is a rotation of a palindrome. For example your function should return true for “aab” as it is a rotation of “aba”. 
//Examples: 
Input:  str = "aaaad"
Output: 1  
// "aaaad" is a rotation of a palindrome "aadaa"
 */
import java.util.*;
public class Prog21b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int flag = 0;
        for(int i=0;i<n;i++) {
            String str1 = str.substring(i,n);
            String str2 = str.substring(0,i);
            String str3 = str1+str2;
            if(isPalindrome(str3)) {
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i=0;i<n/2;i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
}
