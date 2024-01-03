/*Given an array of integers, find the elements which have an even number of digits.
Example
Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
Answer: 42, 5775, 34, 45, 3556
 */
import java.util.*;
public class Prog13b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            int temp = a[i];
            int digits = 0;
            while(temp>0) {
                temp = temp/10;
                digits++;
            }
            if(digits%2==0) {
                System.out.print(a[i]+" ");
                count++;
            }
        }
        System.out.println();
    }
}
