/*Given a 2D matrix arr of size N*M containing lowercase English letters, the task is to find the number of unique rows in the given matrix.
Examples:  
Input:  arr[][]= { {‘a’, ‘b’, ‘c’, ‘d’},  
                          {‘a’, ‘e’, ‘f’, ‘r’},  
                          {‘a’, ‘b’, ‘c’, ‘d’},  
                          {‘z’, ‘c’, ‘e’, ‘f’} }
Output: 2

*/
import java.util.*;
public class Prog34a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char mat[][] = new char[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.next().charAt(0);
            }
        }
        HashSet<String> uniqueRows = new HashSet<>();
        for(int i=0;i<n;i++) {
            StringBuilder row = new StringBuilder();
            for(int j=0;j<m;j++) {
                row.append(mat[i][j]);
            }
            uniqueRows.add(row.toString());
        }
        int cnt = uniqueRows.size();
        System.out.println(cnt);
    }   
}
