/* Given a matrix of M * N elements (M rows, N columns), return all elements of the matrix in spiral order.

Problem Constraints
1 <= M, N <= 1000
Input Format
The first argument is a matrix A.
Output Format
Return an array of integers representing all elements of the matrix in spiral order.
Example Input
A = 
    [
        [ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]
    ]

Example Output
[1, 2, 3, 6, 9, 8, 7, 4, 5]
 */

import java.util.*;
public class Prog19a {
    public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int n = sc.nextInt();
                int arr[][] = new int[m][n];
                for (int i = 0; i < m; i++)
                    for (int j = 0; j < n; j++)
                        arr[i][j] = sc.nextInt();
                int ans[] = new int[m * n];
                int k = 0;
                int l = 0;
                int i;
                while (k < m * n) {
                    for (i = l; i < n; i++)
                        ans[k++] = arr[l][i];
                    l++;
                    for (i = l; i < m; i++)
                        ans[k++] = arr[i][n - 1];
                    n--;
                    if (l < m) {
                        for (i = n - 1; i >= l; i--)
                            ans[k++] = arr[m - 1][i];
                        m--;
                    }
                    if (l < n) {
                        for (i = m - 1; i >= l; i--)
                            ans[k++] = arr[i][l];
                        l++;
                    }
                }
                for (i = 0; i < ans.length; i++)
                    System.out.print(ans[i] + " ");
            }
        }
        