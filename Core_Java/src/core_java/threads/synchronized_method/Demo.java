package core_java.threads.synchronized_method;

public class Demo {
    public static void main(String[] args) throws Exception {
        Counter c=new Counter();
//        Thread t1=new Thread(new Runnable() {
//            public void run() {
//                for (int i = 1; i <= 1000; i++) {
//                    c.increment();
//                }
//            }
//        });
        Thread t1=new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });
        Thread t2=new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}

//Time Complexity: O(2000) = O(1)
//Space Complexity: O(1)