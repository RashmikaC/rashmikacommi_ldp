package core_java.threads.runnable_interface;

public class Demo {
    public static void main(String[] args){
        Runnable obj1=new Hi();
        Hello obj2=new Hello();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}

//Time Complexity: O(n), where n is the total number of iterations across both loops.
//Space Complexity: O(1)