package assignment_8;

public class Main {
    public static void main(String[] args){
        try{
            throwAllExceptions();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block");
        }
    }
    public static void throwAllExceptions() throws CustomException1, CustomException2, CustomException3 {
        throw new CustomException1("CustomException1 occurred");
//        throw new CustomException2("CustomException2 occurred");
//        throw new CustomException3("CustomException3 occurred");
//        throw new NullPointerException();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)