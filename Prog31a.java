/*Given a string str of uppercase alphabets and numbers, the task is to find the number of matchsticks required to represent it.
 * Input: str = “ABC2” 
Output: 22 
static int countSticks(String str)
    {
        int cnt = 0;
     
        // For every char of the given
        // string
        for (int i = 0; i < str.length(); i++) {
     
            char ch = str.charAt(i);
     
            // Add the count of sticks
            // required to represent the
            // current character
            if (ch >= 'A' && ch <= 'Z') {
                cnt += sticks[ch - 'A'];
            }
            else {
                cnt += number[ch - '0'];
            }
        }
        return cnt;
    }
     
    // Driver code
    public static void main (String[] args) 
    {
        String str = "GEEKSFORGEEKS";
     
        // Function call to find the
        // count of matchsticks
        System.out.println(countSticks(str));
     
    }
 */
import java.util.*;
public class Prog31a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sticks[] = new int[26];
        int numbers[] = new int[10];
        for(int i=0;i<26;i++) {
            sticks[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++) {
            numbers[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                cnt += sticks[ch - 'A'];
            }
            else {
                cnt += numbers[ch - '0'];
            }
        }
        System.out.println(cnt);
    }
}
