/*Given an unsorted array of numbers, write a function that returns true if the array consists of consecutive numbers. 

Test Cases:
a) If the array is {5, 2, 3, 1, 4}, then the function should return true because the array has consecutive numbers from 1 to 5.

b) If the array is {83, 78, 80, 81, 79, 82}, then the function should return true because the array has consecutive numbers from 78 to 83.

c) If the array is {34, 23, 52, 12, 3}, then the function should return false because the elements are not consecutive.

d) If the array is {7, 6, 5, 5, 3, 4}, then the function should return false because 5 and 5 are not consecutive.
 */
import java.util.*;
public class Prog21a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++)
            if (a[i] + 1 != a[i + 1])
                System.out.println("false");
        System.out.println("true");
    }
}
