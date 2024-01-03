/*Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
Example:
Input:

1 2 3
4 5 6
7 8 9
Return the following:
[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]
 */
import java.util.*;
public class Prog17a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int countSmaller[] = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = 0;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = i; j >= 0; j--) {
                System.out.print(arr[j][count] + " ");
                count++;
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++) {
            int count = 0;
            for(int j = n - 1; j >= i; j--) {
                System.out.print(arr[j][i + count] + " ");
                count++;
            }
            System.out.println();
        }
    }
}
