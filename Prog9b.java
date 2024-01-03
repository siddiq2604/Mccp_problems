/*
 * B)	The Leaders
Print all those elements that have no element greater than them in the right side of the array. Print elements from right to left.

Test Case 1:
Input : A[] = [1, 2, 3, 4, 5]
Output : 5
Explanation : Only 5 has no element greater than it on its right.

 */
import java.util.*;
public class Prog9b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[n-1];
            System.out.print(max + " ");
            for (int i = n-2; i >= 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                    System.out.print(max + " ");
                }
            }
        }
}
