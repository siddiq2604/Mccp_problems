//Given a string, remove the punctuation from the string if the given character is a punctuation character, as classified by the current C locale. The default C locale classifies these characters as punctuation: 
/*! " # $ % & ' ( ) * + , - . / : ; ? @ [ \ ] ^ _ ` { | } ~ 
Examples: 
Input : %welcome' to @geeksforgeek<s
Output : welcome to geeksforgeeks*/

import java.util.*;
public class Prog3a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);
    }
}
