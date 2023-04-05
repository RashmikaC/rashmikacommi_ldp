package core_java.repetition_control_stmts;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count=0;
//        int count=15;
        do{
            System.out.println(count);
            count++;
        }
        while(count<10);
    }
}
//Time Complexity: O(n), where n is 10
//Space Complexity: O(1)