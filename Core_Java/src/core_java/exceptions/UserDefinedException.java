package core_java.exceptions;

public class UserDefinedException {
    public static void main(String[] args){
        int i=5;
        try{
            if(i<10)
                throw new MyException("Number must be greater than 9");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)