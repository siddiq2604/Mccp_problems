/*Given two strings, we need to take the character which has the maximum occurrence in the first string, and then we have to check if that particular character is present in the second string the same number of times as it is present in the first string.
Examples: 
 
Input : s1 = "sssgeek", s2 = "geeksss"
Output : Yes
 */
import java.util.*;
public class Prog11a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int count1[] = new int[256];
        int count2[] = new int[256];
        for(int i=0;i<s1.length();i++) {
            count1[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++) {
            count2[s2.charAt(i)]++;
        }
        int flag = 0;
        for(int i=0;i<256;i++) {
            if(count1[i] != 0 && count2[i] != 0) {
                if(count1[i] != count2[i]) {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}
