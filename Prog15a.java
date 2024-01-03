/*Given two strings S1 and S2. The task is to concatenate uncommon characters of the S2 to S1  and return the resultant string S1 .
Examples: 
Input: S1 = “aacdb”, S2 = “gafd”
Output: “cbgf”
 */
import java.util.*;
public class Prog15a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = "";
        for(int i=0;i<s1.length();i++){
            if(s2.indexOf(s1.charAt(i))==-1){
                s3 = s3 + s1.charAt(i);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))==-1){
                s3 = s3 + s2.charAt(i);
            }
        }
        System.out.println(s3);
        sc.close();
    }
}
