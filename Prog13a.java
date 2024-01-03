/*
 Given an array of n words. Some words are repeated twice, we need to count such words. 
Examples: 
Input : s[] = {"hate", "love", "peace", "love", 
               "peace", "hate", "love", "peace", 
               "love", "peace"};
Output : 1
There is only one word "hate" that appears twice

 */
import java.util.*;
public class Prog13a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of String Array");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter words:");
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        System.out.println("Number of words repeated twice are: "+countDup(str));
    }
    private static int countDup(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() == 2) {
                count++;
            }
        }

        return count;
    }

}

