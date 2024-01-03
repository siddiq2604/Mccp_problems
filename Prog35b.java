/*Given two string ‘S1’ and ‘S2’, the task is to return the most frequent (which is used the maximum number of times) word from ‘S1’ that is not present in ‘S2’. If more than one word is possible then print lexicographically smallest among them.
Examples: 
Input: S1 = “geeks for geeks is best place to learn”, S2 = “bad place” 
Output: geeks 
“geeks” is the most frequent word in S1 and is also not present in S2. 
The frequency of “geeks” is 2
 */
import java.util.*;
public class Prog35b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        int freq[] = new int[1000];
        for(int i=0;i<arr1.length;i++) {
            freq[arr1[i].charAt(0)]++;
        }
        for(int i=0;i<arr2.length;i++) {
            freq[arr2[i].charAt(0)] = 0;
        }
        int max = 0;
        for(int i=0;i<arr1.length;i++) {
            if(freq[arr1[i].charAt(0)] > max) {
                max = freq[arr1[i].charAt(0)];
            }
        }
        String ans = "";
        for(int i=0;i<arr1.length;i++) {
            if(freq[arr1[i].charAt(0)] == max) {
                if(ans.equals("")) {
                    ans = arr1[i];
                }
                else {
                    if(ans.compareTo(arr1[i]) > 0) {
                        ans = arr1[i];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
