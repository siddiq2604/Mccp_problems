
//Given an array arr[] of size n, The task is to find the GCD of the highest and lowest frequency element in the given array.
//Examples:
//nput: arr[] = {2, 2, 4, 4, 5, 5, 6, 6, 6, 6}
//Output: 2
import java.util.*;

public class Prog1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(gcd(arr));
    }

    public static int gcd(int[] arr) {
        int[] freq = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int max = 0;
        int min = 100000;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                max = Math.max(max, freq[i]);
                min = Math.min(min, freq[i]);
            }
        }
        int gcd = 1;
        for (int i = 1; i <= max && i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
