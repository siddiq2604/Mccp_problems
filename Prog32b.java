/*Given a Matrix size N*N and an integer K. Initially, the matrix contains only 0. You are given K tasks and for each task, you are given two coordinates (r, c). Where coordinates (r, c) denotes the rth row and the cth column of the given matrix. You have to perform each task sequentially in the given order. For each task, You have to put 1 in all rth row cells and all the cth column cells. After each task, You have to calculate the number of 0 present in the matrix and return it.
Examples:
Input: N = 3, K = 3
1 1
1 2
2 1
Output: 4 2 1
Explanation: After 1st Operation, all the cells of the 2nd row and  2nd column will be filled by 1. So, the remaining cell with the value 0 will be 4. After 2nd operation, all the second row and all the third columns will be filled by 1. So, the remaining cell with value will be 2. After 3rd operation number of cells having the value 0 will be 1.
Input: N = 2, K = 2
 */
import java.util.*;
public class Prog32b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0;i<k;i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            for(int j=0;j<n;j++) {
                mat[r-1][j] = 1;
            }
            for(int j=0;j<n;j++) {
                mat[j][c-1] = 1;
            }
            int cnt = 0;
            for(int j=0;j<n;j++) {
                for(int l=0;l<n;l++) {
                    if(mat[j][l] == 0) {
                        cnt++;
                    }
                }
            }
            System.out.print(cnt + " ");
        }
    }
}
