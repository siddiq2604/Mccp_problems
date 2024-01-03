/*) Given an m x n matrix, find all common elements present in all rows in O(mn) time and one traversal of matrix.
Example: 
Input:
mat[4][5] = {{1, 2, 1, 4, 8},
             {3, 7, 8, 5, 1},
             {8, 7, 7, 3, 1},
             {8, 1, 2, 7, 9},
            };

Output: 
1 8 or 8 1
8 and 1 are present in all rows.
 */
import java.util.*;
public class Prog30b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        int freq[] = new int[100000];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
                freq[mat[i][j]]++;
            }
        }
        for(int i=0;i<100000;i++) {
            if(freq[i] == m) {
                System.out.print(i + " ");
            }
        }
    }
}
