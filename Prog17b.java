/*Given string str of the type “3(ab)4(cd)”, the task is to expand it to “abababcdcdcdcd” where integers are from the range [1, 9].

Examples: 
Input: str = “3(ab)4(cd)” 
Output: abababcdcdcdcd
 */
import java.util.*;
public class Prog17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Integer> intStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        String s1 = "";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                intStack.push(str.charAt(i)-'0');
            }
            else if(str.charAt(i)=='('){
                charStack.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                while(charStack.peek()!='('){
                    s1 = charStack.pop()+s1;
                }
                charStack.pop();
                int count = intStack.pop();
                for(int j=0;j<count;j++){
                    for(int k=0;k<s1.length();k++){
                        charStack.push(s1.charAt(k));
                    }
                }
                s1 = "";
            }
            else{
                charStack.push(str.charAt(i));
            }
        }
        while(!charStack.isEmpty()){
            s1 = charStack.pop()+s1;
        }
        System.out.println(s1);
        sc.close();
    }
}
