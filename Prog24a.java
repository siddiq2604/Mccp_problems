/*Given string str of size N, the task is to print the characters of string whose frequency is a power of K in a lexicographically sorted order.
Examples:
Input: str = “aaacbb” K = 2
Output: bbc
Explanation: Frequency of a is 3 which is not the power of 2. Frequency of c is 1 and frequency of b is 2 which are the power of 2. 

*/
import java.util.*;
public class Prog24a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++) {
            if(freq[i] != 0) {
                int flag = 0;
                int c = freq[i];
                while(c > 1) {
                    if(c % k != 0) {
                        flag = 1;
                        break;
                    }
                    c /= k;
                }
                if(flag == 0) {
                    for(int j=0;j<freq[i];j++) {
                        System.out.print((char)(i + 'a'));
                    }
                }
            }
        }
    }
}
