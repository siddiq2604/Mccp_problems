/*Given a string S consisting of lowercase English alphabets, the task is to right shift each character of the given string S circularly by its frequency.
Circular shifting of characters refers to shifting character ‘z’ to ‘a’, as its next character.
Examples:
Input: S = “geeksforgeeks”
Output: iiimugpsiiimu 

*/
import java.util.*;
public class Prog28a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++) {
            int index = s.charAt(i) - 'a';
            int count = freq[index];
            while(count > 0) {
                if(index == 25) {
                    index = 0;
                }
                else {
                    index++;
                }
                count--;
            }
            System.out.print((char)(index + 'a'));
        }
    }
}
