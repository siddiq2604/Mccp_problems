/*
 * Given an array of words and a string, we need to count all words that are present in given string. 
Examples: Input : words[] = { "welcome", "to", "geeks", "portal"}
            str = "geeksforgeeks is a computer science portal for geeks."
Output :  2
Two words "portal" and "geeks" is present in str.

 */
import java.util.*;
public class Prog12a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String words[] = new String[n];
        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }
        sc.nextLine(); 
        String str = sc.nextLine(); 
        int count = 0;
        for(int i=0;i<n;i++) {
            if(str.contains(words[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
       
