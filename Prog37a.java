/*Given a sorted array of length n, find the number in array that appears more than or equal to n/2 times. It is given that such element always exists.
Examples: 
Input :  2 3 3 4
Output : 3
 */
import java.util.*;
public class Prog37a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                max = entry.getKey();
            }
            else if(entry.getValue() == maxFreq) {
                if(entry.getKey() < max) {
                    max = entry.getKey();
                }
            }
        }
        System.out.println(max);
    }
}
