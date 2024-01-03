/*Given a NxM matrix of integers containing duplicate elements. The task is to find the sum of all odd occurring elements in the given matrix. That is the sum of all such elements whose frequency is odd in the matrix.
Examples: 
Input : mat[] = {{1, 1, 2},
                {2, 3, 3},
                {4, 5, 3}}
Output : 18
The odd occurring elements are 3, 4, 5 and their number
of occurrences are 3, 1, 1 respectively. Therefore,
sum = 3+3+3+4+5 = 18.

 */
import java.util.*;
public class Prog27b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(hm.containsKey(mat[i][j])) {
                    hm.put(mat[i][j], hm.get(mat[i][j]) + 1);
                }
                else {
                    hm.put(mat[i][j], 1);
                }
            }
        }
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                sum += entry.getKey();
            }
        }
        System.out.println(sum);
    }
}
