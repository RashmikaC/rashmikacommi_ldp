package core_java.threads.without_threads;

public class Demo {
    public static void main(String[] args){
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.show();
        obj2.show();
    }
}
//Time Complexity: O(20) = O(1)
//Space Complexity: O(1)