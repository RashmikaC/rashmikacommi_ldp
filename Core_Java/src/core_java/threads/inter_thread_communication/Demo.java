package core_java.threads.inter_thread_communication;

public class Demo {
    public static void main(String[] args) {
        Number num=new Number();
        new Producer(num);
        new Consumer(num);
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)