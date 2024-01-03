/*Given an array arr[] of n elements, the task is to replace all the odd positioned elements with their cubes and even positioned elements with their squares i.e. the resultant array must be {arr[0]3, arr[1]2, arr[2]3, arr[3]2, …}.
Examples: 
Input: arr[]= {2, 3, 4, 5} 
Output: 8 9 64 25 
Updated array will be {23, 32, 43, 52} -> {8, 9, 64, 25}
 */
import java.util.*;
public class Prog25a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(i % 2 == 0) {
                res[i] = arr[i] * arr[i] * arr[i];
            }
            else {
                res[i] = arr[i] * arr[i];
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
