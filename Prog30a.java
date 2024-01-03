/*Given an array arr containing N strings and a string str, the task is to find the number of strings that do not contain any character of string str.
Examples:
Input: arr[] = {“abcd”, “hijk”, “xyz”, “ayt”}, str=”apple”
Output: 2
Explanation: “hijk” and “xyz” are the strings that do not contain any character of str
 */
import java.util.*;
public class Prog30a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        String str = sc.next();
        int count = 0;
        for(int i=0;i<n;i++) {
            int flag = 0;
            for(int j=0;j<arr[i].length();j++) {
                if(str.indexOf(arr[i].charAt(j)) != -1) {
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
