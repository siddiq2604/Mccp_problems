/*For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.
Test Case 1: Array: [1, 2, 3, 2, 1]
Number of Identical Twins: 2
Explanation:
Identical Twins: [[1, 1], [2, 2]]
Indexes: (0, 4), (1, 3)
 */
import java.util.*;
public class Prog12b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(set.contains(arr[i])) {
                count++;
            } else {
                set.add(arr[i]);
            }
        }
        
        System.out.println("Number of Identical Twins: "+count);
    }
}
