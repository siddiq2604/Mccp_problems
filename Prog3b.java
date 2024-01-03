/*Given an array arr[] consisting of N integers and a positive integer M, the task is to find the number of array elements that occur at least M times.
Examples:
Input: arr[] = {2, 3, 2, 2, 3, 5, 6, 3}, M = 2
Output: 2 3
 */
import java.util.*;
public class Prog3b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length of the Array:");
        int n=sc.nextInt();
        System.out.print("Enter the value of M:");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        minMax(arr, n, k);
    }   
    public static void minMax(int[] arr1,int n,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> es:hm.entrySet()){
            if(es.getValue()>=k) System.out.print(es.getKey()+" ");
        } 
    }
}
