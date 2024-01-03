/*Given a string, remove duplicate characters from the string, retaining the last occurrence of the duplicate characters. Assume the characters are case-sensitive.
Examples:
Input : geeksforgeeks 
Output : forgeks 
Explanation : Please note that we keep only last occurrences of repeating characters in same order as they appear in input. If we see result from right side, we can notice that we keep last ‘s’, then last ‘k’ , and so on.
 */
import java.util.*;
public class Prog36b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),i);
        }
        String ans = "";
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            ans += entry.getKey();
        }
        System.out.println(ans);
    }
}
