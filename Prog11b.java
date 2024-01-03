/*The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
Examples
Initial Array: [1, 2, 3, 4]
Cumulative Sum: [1, 3, 6, 10]
 */
import java.util.*;
public class Prog11b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Initial Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] cumSum = new int[n];
        cumSum[0] = arr[0];
        for(int i=1;i<n;i++){
            cumSum[i] = cumSum[i-1] + arr[i];
        }
        System.out.println("Cumulative Sum");
        for(int i=0;i<n;i++){
            System.out.print(cumSum[i]+" ");
        }
    }
}
