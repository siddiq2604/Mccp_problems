//Given a string name, we have to find the initials of the name 
//Input  : prabhat kumar singh
//Output : P K S

import java.util.*;

public class Prog1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(initials(name));
    }

    public static String initials(String name) {
        String[] arr = name.split(" ");
        String ans = "";
        for (String s : arr) {
            ans += s.charAt(0) + " ";
        }
        return ans;
    }
}
