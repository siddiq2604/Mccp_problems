/*Given an array A, find the maximum number of consecutive 1s in the array.
Examples
A: [1, 1, 3, 2, 3, 1, 1, 1]
Max consecutive 1s: 3
 */
import java.util.*;
public class Prog14b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            if(count > max) {
                max = count;
            }
        }
        System.out.println("Max consecutive 1s: " + max);
    }
}
