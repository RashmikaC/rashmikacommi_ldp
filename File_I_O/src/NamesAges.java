import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesInput;
        Scanner agesInput;
        try{
            namesInput=new Scanner(new File("student_names.txt"));
            agesInput=new Scanner(new File("student_ages.txt"));
            PrintWriter pw=new PrintWriter("names_ages_output.txt");
            while(namesInput.hasNext())
            {
                String name = namesInput.nextLine();
                int age = agesInput.nextInt();
                pw.println(name+" is "+age+" years old.");
                System.out.println(name+" is "+age+" years old.");
            }
            namesInput.close();
            agesInput.close();
            pw.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
