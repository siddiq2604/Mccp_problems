/*
 * Given a matrix mat[][] of size M * N, the task is to find all matrix elements which are minimum in their respective row and maximum in their respective column. If no such element is present, print -1.
Examples:
Input: mat[][] = {{1, 10, 4}, {9, 3, 8}, {15, 16, 17}}
Output: 15
Explanation:
15 is the only element which is maximum in its column {1, 9, 15} and minimum in its row {15, 16, 17}.

 */
import java.util.*;
public class Prog24b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int min[] = new int[m];
        int max[] = new int[n];
        for(int i=0;i<m;i++) {
            min[i] = Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++) {
            max[i] = Integer.MIN_VALUE;
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] < min[i]) {
                    min[i] = mat[i][j];
                }
                if(mat[i][j] > max[j]) {
                    max[j] = mat[i][j];
                }
            }
        }
        int flag = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] == min[i] && mat[i][j] == max[j]) {
                    System.out.print(mat[i][j] + " ");
                    flag = 1;
                }
            }
        }
        if(flag == 0) {
            System.out.println("-1");
        }
    }
}
