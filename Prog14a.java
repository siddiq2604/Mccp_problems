/*Given a string S, the task is to count the number of camel case characters present in the given string.
The camel case character is defined as the number of uppercase characters in the given string.
Examples:
Input: S = “ckjkUUYII”
Output: 5
Explanation: 
Camel case characters present are U, U, Y, I and I.
 */
import java.util.*;
public class Prog14a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
