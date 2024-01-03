/*
 * A)	Check if given String is Pangram or not
Given a string Str. The task is to check if it is Pangram or not. 
A pangram is a sentence containing every letter in the English Alphabet.
Examples: 
Input: “The quick brown fox jumps over the lazy dog” 
Output: is a Pangram 
Explanation: Contains all the characters from ‘a’ to ‘z’] 
 */
import java.util.*;
 public class Prog9a{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
                        String str = sc.nextLine();
                        str = str.toLowerCase();
                        int[] arr = new int[26];
                        for (int i = 0; i < str.length(); i++) {
                            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                                arr[str.charAt(i) - 'a']++;
                            }
                        }
                        boolean flag = true;
                        for (int i = 0; i < 26; i++) {
                            if (arr[i] == 0) {
                                flag = false;
                                break;
                            }
                        }
            if (flag) {
                System.out.println("is a Pangram");
            } else {
                System.out.println("Not a pangram");
            }
        }
 }
