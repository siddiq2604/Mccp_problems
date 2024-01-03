/*
 * B)	Given marks of N students sitting on a bench and a value of K, print the index of the student whose marks matches with the value of K.
Input : N = 10, K = 67
 A[] = [60, 61, 62, 63, 63, 64, 65, 66, 67, 66]
Output : 8

 */
import java.util.*;
 public class Prog8b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == k) {
                    index = i;
                    break;
                }
            }
            System.out.println(index);
        }
}
