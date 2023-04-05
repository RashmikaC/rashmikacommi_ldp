package FileOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("ABC");
        names.add("XYZ");
        names.add("PQR");
        names.add("IJK");
        names.add("LMN");
        try{
            PrintWriter pw=new PrintWriter("names.txt");
            for(int i=0;i<names.size();i++)
            {
                pw.println(names.get(i));
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to the file!");
        }
    }
}
