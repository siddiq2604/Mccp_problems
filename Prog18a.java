/*) Given an integer array A of size N. You need to check that whether there exist a element which is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it.If it exists return 1 else return 0.
NOTE:  Do not consider the corner elements i.e A[0] and A[N-1] as the answer.
Problem Constraints: 3 <= N <= 105
1 <= A[i] <= 109
Input Format: First and only argument is an integer array A containing N integers.
Output Format : Return 1 if there exist a element that is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it else return 0.
Example Input
Input 1:  A = [5, 1, 4, 3, 6, 8, 10, 7, 9]
Input 2:  A = [5, 1, 4, 4]
Example Output:
Output 1: 1
Output 2: 0
Explanation 1: A[4] = 6 is the element we are looking for.
 All elements on left of A[4] are smaller than it and all elements on right are greater.
Explanation 2: No such element exits.

 */
import java.util.*;
public class Prog18a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i=1;i<n;i++)
            left[i] = Math.max(left[i-1],arr[i]);
        for(int i=n-2;i>=0;i--)
            right[i] = Math.min(right[i+1],arr[i]);
        int ans = 0;
        for(int i=1;i<n-1;i++)
            if(arr[i]>left[i-1] && arr[i]<right[i+1])
                ans = 1;
        System.out.println(ans);
    }
}
