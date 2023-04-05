package core_java.selection_control_stmts;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your grade:");
        char grade=input.next().charAt(0);
        switch(grade)
        {
            case 'A':
            case 'a':
                System.out.println("Great Job!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("You can do better");
                break;
            case 'D':
                System.out.println("You are getting close to failing");
                break;
            case 'F':
                System.out.println("You have failed");
                break;
            default:
                System.out.println("You have entered an invalid grade");
        }
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)