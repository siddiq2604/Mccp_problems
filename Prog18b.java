/*Given an array of numbers, find GCD of the array elements. In a previous post we find GCD of two number.
Examples:
Input  : arr[] = {1, 2, 3}
Output : 1
 */
import java.util.*;
public class Prog18b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int ans = arr[0];
        for(int i=1;i<n;i++)
            ans = gcd(ans,arr[i]);
        System.out.println(ans);
    }
    static int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
