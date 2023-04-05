package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        Scanner infile;
        try{
            infile=new Scanner(new File("input.txt"));
            int input;
            while(infile.hasNext())
            {
                input =infile.nextInt();
                System.out.println(input);
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Can't find file!, "+ex.getMessage());
        }
    }
}
