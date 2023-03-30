package core_java.exceptions;

public class UncheckedException {
    public static void main(String[] args){
        int i,j,k=5;
        int a[]=new int[4];
        i=8;
        j=2;
        try{
            k=i/j;
            for(int p=0;p<=4;p++)
                a[p]=i+1;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception :"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception :"+e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(k);
    }
}
//run time exception

//Time Complexity: O(1)
//Space Complexity: O(1)