/*
 * For a given value N, denoting the number of Charters starting from the A, print reverse character bridge pattern.
Examples :   
Input : n = 5
Output :
 ABCDEDCBA
 ABCD DCBA
 ABC   CBA
 AB     BA
 A       A

 */
import java.util.*;
public class Prog4b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((char)(j+65));
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                if(j!=n) System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }    
}
