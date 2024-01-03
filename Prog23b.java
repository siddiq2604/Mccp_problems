/*Count all elements in the array which appears at least K times after their first occurrence

Given an array arr[] of N integer elements and an integer K. The task is to count all distinct arr[i] such that arr[i] appears at least K times in the index range i + 1 to n – 1.
Examples: 
Input: arr[] = {1, 2, 1, 3}, K = 1 
Output: 1 
arr[0] = 1 is the only element that appears at least once in the index range [1, 3] i.e. arr[2]
 */
import java.util.*;
public class Prog23b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            int flag = 0;
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    flag++;
                    if(flag == k) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
