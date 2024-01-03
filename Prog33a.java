/*Given a matrix mat[][] with dimensions M * N, the task is to replace each matrix elements with the maximum sum of its left or right diagonal.
Examples:
Input: mat[][] = {{5, 2, 1}, {7, 2, 6}, {3, 1, 9}}
Output: 
16  9   6 
9 16   8
6   8 16
Explanation:
Replace each element with max(sum of right diagonal, sum of left diagonal).
Follow the diagram below to understand more clearly.

*/
import java.util.*;
public class Prog33a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[100][100];
        int left[][] = new int[100][100];
        int right[][] = new int[100][100];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                left[i][j] = 0;
                right[i][j] = 0;
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i == 0 || j == 0) {
                    left[i][j] = mat[i][j];
                }
                else {
                    left[i][j] = mat[i][j] + left[i-1][j-1];
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=n-1;j>=0;j--) {
                if(i == 0 || j == n-1) {
                    right[i][j] = mat[i][j];
                }
                else {
                    right[i][j] = mat[i][j] + right[i-1][j+1];
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(left[i][j] > right[i][j]) {
                    mat[i][j] = left[i][j];
                }
                else {
                    mat[i][j] = right[i][j];
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
