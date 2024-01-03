/*
 * Given two strings which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string.
Examples : 
Input : string strA = "abcd";
        string strB = "cbdae";
Output : e

 */
import java.util.*;
public class Prog6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String strA:");
        String s1 = sc.nextLine();
        System.out.println("String strB:");
        String s2 = sc.nextLine();

        Map<Character, Integer> mp = new HashMap<>();
        for (char c : s1.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!mp.containsKey(c) || mp.get(c) == 0) {
                System.out.println(c);
                break;
            } else {
                mp.put(c, mp.get(c) - 1);
            }
        }
    }
}