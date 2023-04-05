package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner infile;
        int sum=0;
        try{
            infile=new Scanner(new File("input.txt"));
            int input;
            while(infile.hasNext())
            {
                input =infile.nextInt();
                System.out.println(input);
                sum+=input;
            }
            System.out.println("Sum is "+sum);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Can't find file!, "+ex.getMessage());
        }
    }
}
