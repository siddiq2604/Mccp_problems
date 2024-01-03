/*Given a positive integer n, the task is to check if it is Euclid Number or not. Print ‘YES’ if the given number is Euclid Number otherwise print ‘NO’.
Euclid number : In Mathematics, Euclid numbers are integers of the form – 
E=P#+1
where P# is product of first n prime numbers.
The first few Euclid numbers are- 
3, 7, 31, 211, 2311, 30031, 510511, 9699691, ……….
Input: N = 31
Output: YES
 */
import java.util.*;
public class Prog4a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N:");
        int N=sc.nextInt();
        if (isEuclidNumber(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isEuclidNumber(int N) {
        int count = 0;
        long product = 1;
        for (int i = 2; count < N; i++) {
            if (isPrime(i)) {
                count++;
                product *= i;
            }
        }
        return product + 1 == N;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
