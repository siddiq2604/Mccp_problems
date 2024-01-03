/*Given an array, we have to find the sum of all the elements repeating k times in an array. We need to consider every repeating element just once in the sum.
Examples: 
Input : arr[] = {2, 3, 9, 9}
            k = 1
Output : 5
2 + 3 = 5
I can help you with that. Here is a possible solution in Java:

Java
AI-generated code. Review and use carefully. More info on FAQ.

public class Duplicate {
  public static int sumKRepeating(int[] arr, int k) {
    int sum = 0;
    // Use a hash map to store the frequencies of each element
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    // Iterate over the map and add the elements that have frequency k to the sum
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == k) {
        sum += entry.getKey();
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 9, 9};
    int k = 1;
    System.out.println(sumKRepeating(arr, k)); // Output: 5
  }
}
 */
import java.util.*;
public class Prog35a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int num = sc.nextInt();
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == k) {
                sum += entry.getKey();
            }
        }
        System.out.println(sum);
    }
}
