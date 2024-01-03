//A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers. Please note that a numbers with only leading 0s is not considered as Duck Number. For example, numbers like 035 or 0012 are not considered as Duck Numbers. A number like 01203 is considered as Duck because there is a non-leading 0 present in it.
//Examples :
//Input : 707069 
//Output : It is a duck number. 
//Explanation: 707069 does not contains zeros at the beginning.
//Input : 02364 
//Output : It is not a duck number. 
//Explanation: in 02364 there is a zero at the beginning of the number.

//Time Complexity: O(n) where n is length of string.
//Auxiliary Space: O(1)

import java.util.*;

public class Prog2a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isDuck(s)){
            System.out.println("It is a duck number.");
        }
        else{
            System.out.println("It is not a duck number.");
        }
    }
    public static boolean isDuck(String s){
        int i = 0;
        while(i < s.length() && s.charAt(i) == '0'){
            i++;
        }
        while(i < s.length()){
            if(s.charAt(i) == '0'){
                return true;
            }
            i++;
        }
        return false;
    }
}