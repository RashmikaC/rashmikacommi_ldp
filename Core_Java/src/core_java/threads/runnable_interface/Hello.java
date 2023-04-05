package core_java.threads.runnable_interface;

public class Hello implements Runnable  {
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }
}
