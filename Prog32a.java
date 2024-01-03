/*Given a string str and an array of strings arr[] of size N, the task is to print a string from arr[], which has maximum count of matching characters with str.
Examples:
Input: str = “vikas”, N = 3, arr[] = [“preeti”, “khusbu”, “katherina”] 
Output: “katherina” 
Explanation: 
Number of similar characters between Str and each string in D[ ] are,  
“preeti” = 1 
“khusbu” = 2 
“katherina” = 3 
Hence, “katherina” has maximum matching characters.
 */
import java.util.*;
public class Prog32a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String arr[] = new String[100];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        int max = 0;
        String ans = "";
        for(int i=0;i<n;i++) {
            int cnt = 0;
            for(int j=0;j<arr[i].length();j++) {
                if(str.indexOf(arr[i].charAt(j)) != -1) {
                    cnt++;
                }
            }
            if(cnt > max) {
                max = cnt;
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
