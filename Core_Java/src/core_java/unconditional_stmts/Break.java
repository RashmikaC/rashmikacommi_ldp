package core_java.unconditional_stmts;

public class Break {
    public static void main(String[] args){
        int count=0;
        while(count<10)
        {
            if(count==5){
                count++;
                break;
            }
            System.out.print(count+"\t");
            count++;
        }
    }
}
//Time Complexity: O(n), where n is 5
//Space Complexity: O(1)