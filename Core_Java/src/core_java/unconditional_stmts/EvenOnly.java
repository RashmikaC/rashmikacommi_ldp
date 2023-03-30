package core_java.unconditional_stmts;

public class EvenOnly {
    public static void main(String[] args){
        int count=0;
        while(count<10){
            if(count%2!=0)
            {
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