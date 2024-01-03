/*You have given an integer matrix with odd dimensions. Find the square of the diagonal elements on both sides.
Examples:
Input  :  1 2 3
         4 5 6
         7 8 9
Output :  Diagonal one: 1 25 81
         Diagonal two: 9 25 49
 */
import java.util.*;
public class Prog29b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        int diag1[] = new int[n];
        int diag2[] = new int[n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            diag1[i] = mat[i][i];
            diag2[i] = mat[i][n-i-1];
        }
        for(int i=0;i<n;i++) {
            System.out.print(diag1[i]*diag1[i] + " ");
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(diag2[i]*diag2[i] + " ");
        }
    }
}
