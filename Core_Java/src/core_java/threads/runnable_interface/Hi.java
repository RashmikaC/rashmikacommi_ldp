package core_java.threads.runnable_interface;

public class Hi implements Runnable {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }
}
