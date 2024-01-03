/*Given string str, the task is to print the characters in decreasing order of their frequency. If the frequency of two characters is the same then sort them in descending order alphabetically.
Examples: 
 Input: str = “geeksforgeeks” 
Output: 
e – 4 
s – 2 
k – 2 
g – 2 
r – 1 
o – 1 
f – 1
 */
import java.util.*;
public class Prog33b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int freq[] = new int[1000];
        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i)]++;
        }
        int max = 0;
        for(int i=0;i<str.length();i++) {
            if(freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
            }
        }
        for(int i=max;i>=1;i--) {
            for(int j=0;j<str.length();j++) {
                if(freq[str.charAt(j)] == i) {
                    System.out.println(str.charAt(j) + " - " + i);
                }
            }
        }
    }
}
