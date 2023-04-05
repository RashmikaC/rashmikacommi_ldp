package core_java.threads.thread_class;

public class Hello extends Thread {
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
