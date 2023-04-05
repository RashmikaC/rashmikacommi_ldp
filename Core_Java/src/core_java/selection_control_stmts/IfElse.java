package core_java.selection_control_stmts;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.println("Enter your age:");
        age =input.nextInt();
        if(age>=21){
            System.out.println("You can have a beer!");
        }
        else if(age>=16){
            System.out.println("You can have a coke!");
            System.out.println("At least you can drive!");
        }
        else{
            System.out.println("You can have a coke");
        }
        System.out.println("Thanks for visiting!");
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)