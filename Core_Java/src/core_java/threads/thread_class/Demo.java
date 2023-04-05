package core_java.threads.thread_class;

public class Demo {
    public static void main(String[] args){
        Thread obj1=new Hi();
        Hello obj2=new Hello();
        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
//        obj1.run();
    }
}
//Priority 1 to 10 , default-5
//Using priority we can only suggest what should be done.

//Time Complexity: O(n) , where n is the number of iterations in each thread's loop
//Space Complexity: O(1)