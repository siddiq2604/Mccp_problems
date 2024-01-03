/*Given an array of strings words and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.
Example 1:
Input: words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"], word1 = "fox", word2 = "dog"
Output: 5
Explanation: The distance between "fox" and "dog" is 5 words.
 */
import java.util.*;
public class Prog26a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }
        String word1 = sc.next();
        String word2 = sc.next();
        int index1 = -1;
        int index2 = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(words[i].equals(word1)) {
                index1 = i;
            }
            if(words[i].equals(word2)) {
                index2 = i;
            }
            if(index1 != -1 && index2 != -1) {
                min = Math.min(min, Math.abs(index1 - index2));
            }
        }
        System.out.println(min);
    }
}
