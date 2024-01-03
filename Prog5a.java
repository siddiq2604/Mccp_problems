/*Given two numbers L, R which signifies the range [L, R], the task is to find the sum of all perfect numbers lying in the range [L, R].
Examples: 
 
  Input: L = 6, R = 10 
Output: 6 
 */
import java.util.*;
public class Prog5a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("L:");
        int l=sc.nextInt();
        System.out.println("R:");
        int r=sc.nextInt();
        int sum=0;
        for(int i=l;i<=r;i++){
            if(isPerfect(i)) sum+=i;
        }
        System.out.println(sum);
    }
    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        if(sum==n) return true;
        else return false;
    }
}
