package core_java.repetition_control_stmts;

public class WhileLoop {
    public static void main(String[] args) {
        int count=0;
        //counts numbers 0 to 9
        while(count<10)
        {
            System.out.println(count);
            count++;
        }
    }
}
//Time Complexity: O(n), where n is 10
//Space Complexity: O(1)