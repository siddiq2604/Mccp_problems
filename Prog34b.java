/*Given an array arr[] of strings and integers X and Y, the task is to find the count of strings with frequency of each character at most X and length of the string at least Y.
Examples:
Input: arr[] = { “ab”, “derdee”, “erre” }, X = 2, Y = 4
Output: 1
Explanation: Strings with character frequency at most 2 and 
length at least 4 is “erre”. Hence count is 1
 */
import java.util.*;
public class Prog34b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        int cnt = 0;
        for(int i=0;i<n;i++) {
            int freq[] = new int[1000];
            for(int j=0;j<arr[i].length();j++) {
                freq[arr[i].charAt(j)]++;
            }
            int max = 0;
            for(int j=0;j<arr[i].length();j++) {
                if(freq[arr[i].charAt(j)] > max) {
                    max = freq[arr[i].charAt(j)];
                }
            }
            if(max <= x && arr[i].length() >= y) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
