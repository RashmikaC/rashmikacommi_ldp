package core_java.repetition_control_stmts;
import java.util.Scanner;

public class SumFun {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a non negative number to add sum \nEnter negative to exit");
        int num=input.nextInt();
        while(num>0)
        {
            sum+=num;
            System.out.println("Enter a non negative number to continue \nEnter negative to exit \nTill now sum is "+sum);
            num=input.nextInt();
        }
        System.out.println("Final sum is "+sum);
    }
}
//Time complexity : O(n), where n is the number of non-negative integers entered by the user
//Space complexity : O(1)