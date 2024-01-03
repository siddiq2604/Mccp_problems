/*Given an array A of n elements, sort the array according to the following relations :  
•	A[i]>=A[i-1], if i is even.  
•	A[i]<=A[i-1], if i is odd. 
Print the resultant array.
Examples :  
Input : A[] = {1, 2, 2, 1}
Output :  1 2 1 2
Explanation : 
For 1st element, 1  1, i = 2 is even.
3rd element, 1  1, i = 4 is even.
 */
    import java.util.*;
    public class Prog15b {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int temp=0;
            for(int i=0;i<n-1;i++){
                if(i%2==0 && arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
                else if(i%2!=0 && arr[i]<arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            for(Integer i : arr){
                System.out.println(i);
        }
    }
    
    }

