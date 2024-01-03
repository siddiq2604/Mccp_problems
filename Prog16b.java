/*Given an unsorted array arr[] of distinct integers, construct another array countSmaller[] such that countSmaller[i] contains the count of smaller elements on the right side of each element arr[i] in the array.
Examples: 
Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4}
Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0} 
 */
import java.util.*;
public class Prog16b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int countSmaller[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[i]) {
                    count++;
                }
            }
            countSmaller[i] = count;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(countSmaller[i] + " ");
        }
    }
}
