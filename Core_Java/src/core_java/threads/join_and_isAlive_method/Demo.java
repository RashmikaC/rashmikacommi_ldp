package core_java.threads.join_and_isAlive_method;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {}
            }
        },"Hi Thread");
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {}
            }
        });
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        t1.join(); //Waits for this thread to die
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");//main thread
    }
}

//Time Complexity: O(10)=O(1)
//Space Complexity: O(1)