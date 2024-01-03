/*
 * Given an array A with N integers, find the count of unique integers in the array.

Input : arr = [3 2 4 1 2 3]
Output : 2
Explanation: only 1 and 4 are unique in the array rest 2, 3 are occurring 2 times
 */
import java.util.*;
public class Prog6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int i : mp.keySet()) {
            if (mp.get(i) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
