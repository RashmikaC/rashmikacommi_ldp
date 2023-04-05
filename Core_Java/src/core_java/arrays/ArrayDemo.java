package core_java.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=input.nextInt();
        int myArray[]=new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++)
        {
            myArray[i]= input.nextInt();
        }
        System.out.println("Numbers are :");
        for(int element:myArray)
            System.out.print(element+"\t");
        System.out.println();
        System.out.println(Arrays.toString(myArray));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=length of array