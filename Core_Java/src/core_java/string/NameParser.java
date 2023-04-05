package core_java.string;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName=input.nextLine();
        int indexOfSpace=fullName.indexOf(" ");
        String firstName=fullName.substring(0,indexOfSpace);
        String lastName=fullName.substring(indexOfSpace+1);
        firstName=firstName.toUpperCase(); // here it doesn't modify the firstName, it's actually creating new String in all caps, then returning the address of it to firstName
        lastName=lastName.toLowerCase();
        System.out.println("First name :"+firstName);
        System.out.println("Last name :"+lastName);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n), where n is the length of the input string fullName