/*Given a full name in the form of a string, the task is to print the initials of a name, in short, and surname in full. 
Examples:
Input: Devashish Kumar Gupta
Output: D. K. Gupta
 */
import java.util.*;
public class Prog7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = sc.nextLine();
        String[] arr = name.split(" ");
        String initials = "";
        for (int i = 0; i < arr.length - 1; i++) {
            initials += arr[i].charAt(0) + ". ";
        }
        System.out.println(initials + arr[arr.length - 1]);
    }
}
