package assignment_2;

import java.util.Scanner;

public class Assignment2 {
    public static boolean containsAllLetters(String str) {
        boolean[] seen = new boolean[26];
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;  // set the seen flag true for this letter
            }
        }
        for (boolean alphabet : seen) {
            if (!alphabet) {
                return false; // if any flag is still false, not all letters have been seen
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=input.nextLine();
        boolean result=containsAllLetters(str);
        if(result)
            System.out.println("The given string contains all alphabets");
        else
            System.out.println("The given string does not contain all alphabets");
    }
}
//    Time complexity: O(n) , because it iterates through the string once
//    Space complexity: O(26) = O(1) , because it uses a fixed-size boolean array of length 26