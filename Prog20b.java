/*Given a string str and an integer X. The task is to find whether the first X characters of both string str and reversed string str are same or not. If it is equal then print true, otherwise print false.

Examples:
Input: str = abcdefba, X = 2
Output: true
Explanation: 
First 2 characters of both string str and reversed string str are same.
 */
import java.util.*;
public class Prog20b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x = sc.nextInt();
        int i;
        for (i = 0; i < x; i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                break;
        if (i == x)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
