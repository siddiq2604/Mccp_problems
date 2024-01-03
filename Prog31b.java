/*Given an array of n integers. The task is to find the difference of first and last index of each distinct element so as to maximize the difference.
Examples: 
Input : {2, 1, 3, 4, 2, 1, 5, 1, 7}
Output : 6
Element 1 has its first index = 1 and last index = 7 Difference = 7 - 1 = 6
Other elements have a smaller first and last index difference
 */
import java.util.*;
public class Prog31b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[100];
        int first[] = new int[100];
        int last[] = new int[100];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            first[i] = -1;
            last[i] = -1;
        }
        for(int i=0;i<n;i++) {
            if(first[arr[i]] == -1) {
                first[arr[i]] = i;
            }
            last[arr[i]] = i;
        }
        int max = 0;
        for(int i=0;i<n;i++) {
            if(first[arr[i]] != -1) {
                int diff = last[arr[i]] - first[arr[i]];
                if(diff > max) {
                    max = diff;
                }
                first[arr[i]] = -1;
            }
        }
        System.out.println(max);
    }
}
