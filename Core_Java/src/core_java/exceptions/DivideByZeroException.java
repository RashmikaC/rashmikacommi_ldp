package core_java.exceptions;

public class DivideByZeroException {
    public static void main(String[] args){
        int i,j,k=5;
        i=8;
        j=0;
        try{
            k=i/j;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(k);
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)