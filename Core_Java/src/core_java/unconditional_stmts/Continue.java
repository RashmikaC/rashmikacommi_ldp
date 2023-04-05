package core_java.unconditional_stmts;

public class Continue {
    public static void main(String[] args){
        int count=0;
        while(count<10)
        {
            if(count==5){
                count++;
                continue;
            }
            System.out.print(count+"\t");
            count++;
        }
    }
}
//Time Complexity: O(n), where n is 10
//Space Complexity: O(1)