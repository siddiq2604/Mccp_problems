/*Given an array arr containing N strings, the task is to check if all strings are isogram or not. If they are, print Yes, otherwise No.
An Isogram is a word in which no letter occurs more than once.
Examples:
Input: arr[] = {“abcd”, “derg”, “erty”}
Output: Yes

*/
import java.util.*;
public class Prog27a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        boolean flag = true;
        for(int i=0;i<n;i++) {
            String s = arr[i];
            for(int j=0;j<s.length();j++) {
                for(int k=j+1;k<s.length();k++) {
                    if(s.charAt(j) == s.charAt(k)) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if(flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
