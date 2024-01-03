/*
 * Given two strings, the task is to check whether the frequencies of a character(for each character) in one string are multiple or a factor in another string. If it is, then output “YES”, otherwise output “NO”.
Examples: 
Input: s1 = “aabccd”, s2 = “bbbaaaacc” 
Output: YES 

 */
import java.util.*;
public class Prog8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            mp1.put(c, mp1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            mp2.put(c, mp2.getOrDefault(c, 0) + 1);
        }
        boolean flag = true;
        for (char c : mp1.keySet()) {
            if (mp2.getOrDefault(c, 0) % mp1.get(c) != 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
