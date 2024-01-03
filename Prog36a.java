/*given array arr[] and find the maximum element of the frequency array. If two elements have the same frequency in the array freq[], then return the element which has a smaller value.
Examples:
Input: arr[] = {1, 1, 1, 2, 3, 2, 2, 3, 5, 5, 5, 5, 4, 4, 4, 4, 4}; 
Output: 3 
Explanation: 
frequency of elements is given by: 
val -> freq[] 
1 -> 3 
2 -> 3 
3 -> 2 
4 -> 5 
5 -> 4 
Element 3 has the maximum frequency in the frequency array.
 */
import java.util.*;
public class Prog36a {
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
