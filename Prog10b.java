/*
 * B)	Given an array A of N elements, your task is to print all those indexes that have values greater than its left and right neighbors. In case of extreme indexes like 0 and N-1, check with their single neighbor.
 input: A = [7 2 8 4 3 9 1]
 output : 0 2 5
 */
import java.util.*;
public class Prog10b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] > arr[1]) {
                System.out.print(0 + " ");
            }
            for (int i = 1; i < n-1; i++) {
                if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                    System.out.print(i + " ");
                }
            }
            if (arr[n-1] > arr[n-2]) {
                System.out.print(n-1 + " ");
            }
        }
}
