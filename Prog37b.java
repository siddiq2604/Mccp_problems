/*Given a string ‘str’, the task is to remove all the characters from the string that have even frequencies.
Examples: 
Input: str = "aabbbddeeecc"
Output: bbbeee
The characters a, d, c have even frequencies
So, they are removed from the string.
 */
import java.util.*;
public class Prog37b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        String ans = "";
        for(int i=0;i<s.length();i++) {
            if(map.get(s.charAt(i)) % 2 != 0) {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
