package core_java.threads.inter_thread_communication;

public class Producer implements Runnable{
    Number number;
    public Producer(Number number)
    {
        this.number=number;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run(){
        int i=0;
        while(i<=20)
        {
            number.put(i++);
            try{ Thread.sleep(1000); }
            catch(Exception e){};
        }
    }
}
