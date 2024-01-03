/*Given two arrays, the task is that we find numbers which are present in first array, but not present in the second array. 
Examples : 
Input : a[] = {1, 2, 3, 4, 5, 10};
    b[] = {2, 3, 1, 0, 5};
Output : 4 10    
4 and 10 are present in first array, but
not in second array.
 */
import java.util.*;
public class Prog20a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n], b[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++)
            b[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n - 1; j++)
                if (a[i] == b[j])
                    break;
            if (j == n - 1)
                System.out.print(a[i] + " ");
        }
    }
}
