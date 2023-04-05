package core_java.selection_control_stmts;
import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();
        System.out.println("Enter your gender in uppercase");
        char gender=input.next().charAt(0);
        if(age>=19 && gender=='M')
        {
            System.out.println("You can join the fraternity");
        }
        else{
            System.out.println("Sorry, you cannot join the fraternity");
        }
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)