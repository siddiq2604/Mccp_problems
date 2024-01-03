
//given an array arr[] of N integer, the task is to find the count of element in the array that are present K times and their double are not present in the array
//Examples:
//Input: arr[] = {10, 6, 12, 8, 10, 8}, K = 2
//Output: 2

import java.util.*;

public class Prog22b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        System.out.println(countD(arr, k));
    }

    public static int countD(int[] arr, int k) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                count++;
            } else {
                set.add(i * 2);
            }
        }
        return count;
    }
}
