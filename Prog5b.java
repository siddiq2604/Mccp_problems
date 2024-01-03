/*
 * Given a string, count the number of words in it. The words are separated by the following characters: space (‘ ‘) or new line (‘\n’) or tab (‘\t’) or a combination of these.

Input: S = "abc def"
Output: 2

 */
import java.util.*;
public class Prog5b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || s.charAt(i)=='\n' || s.charAt(i)=='\t') count++;
        }
        System.out.println(count+1);
    }
}
