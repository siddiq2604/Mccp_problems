/*You are given a binary string str of length n. Suppose you create another string of size n * k by concatenating k copies of str together. What is the maximum size of a substring of the concatenated string consisting only of 0’s? Given that k > 1. 
Examples:
Input : str = “110010”, k = 2 
Output : 2 
 */
import java.util.*;
public class Prog16a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int count = 0;
        int max = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                count++;
            }
            else {
                count = 0;
            }
            if(count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
