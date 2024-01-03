/*Given an n x n matrix. In the given matrix, you have to print the elements of the matrix in the snake pattern.
Examples : 
Input: mat[][] = { {10, 20, 30, 40},
                            {15, 25, 35, 45},
{27, 29, 37, 48},
                           {32, 33, 39, 50}};
Output: 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32 
 */
import java.util.*;
public class Prog28b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
