/*
 * B)	Given an array of size N, which contains the voting ID's of students that have stood up for the elections for class monitor, the candidate with votes greater than half the strength of the class will become monitor, find the ID of candidate that can become monitor else return -1 if no one can become.

Input : A = [1, 3, 2, 2, 2]
Output : 2
Explanation : 2 got 3 votes which is greater than half the strength of the class i.e. 5/2 = 2.

 */
import java.util.*;
public class Prog7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int i : mp.keySet()) {
            if (mp.get(i) > n / 2) {
                System.out.println(i);
                break;
            }
        }
    }
}
