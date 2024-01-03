/*Given an array arr[] containing N strings and an integer K, the task is to find the count of strings with the frequency of each character at most K
Examples:
Input: arr[] = { “abab”, “derdee”, “erre” }, K = 2
Output: 2
Explanation: Strings with character frequency at most 2 are “abab”, “erre”. Hence count is 2
 */
import java.util.*;
public class Prog23a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        int k = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++) {
            String str = arr[i];
            int flag = 0;
            for(int j=0;j<str.length();j++) {
                int c = 0;
                for(int l=0;l<str.length();l++) {
                    if(str.charAt(j) == str.charAt(l)) {
                        c++;
                    }
                }
                if(c > k) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
