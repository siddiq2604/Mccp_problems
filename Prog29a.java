/*Given a string S consisting only of lowercase letters check if the string has all characters appearing even times. 
Examples:
Input : abaccaba 
Output : Yes 
Explanation: ‘a’ occurs four times, ‘b’ occurs twice, ‘c’ occurs twice and the other letters occur zero times.
Input:  hthth 
Output : No
 */
import java.util.*;
public class Prog29a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++) {
            if(freq[i] % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
