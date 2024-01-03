//Given an array of integers arr[] of size N and a number K, the task is to find the Kth most occurring element in this array.
//Note: If there are more than one numbers in the array with the same frequency, then both are considered to be at the same level of occurrence. Therefore print both the numbers. 
//Examples: 
//Input: arr[] = {1, 2, 2, 2, 4, 4, 4, 5, 5, 5, 5, 5, 7, 7, 8, 8, 8, 8}, K = 1 
//Output: 5 


import java.util.*;

public class Prog2b {
    public static void minMax(int[] arr1,int n,int k){
                HashMap<Integer,Integer> hm=new HashMap<>();
                for(int i=0;i<arr1.length;i++){
                    hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
                }
                for(Map.Entry<Integer,Integer> es:hm.entrySet()){
                    if(es.getValue()==k) System.out.print(es.getKey());
                } 
            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Length of the Array:");
                int n=sc.nextInt();
                System.out.print("Enter the value of k:");
                int k=sc.nextInt();
                int arr[]=new int[n];
                System.out.println("Enter the Array:");
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                minMax(arr, n, k);
                
            }  
}
