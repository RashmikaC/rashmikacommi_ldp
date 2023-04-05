package core_java.threads.inter_thread_communication;

public class Consumer implements Runnable{
        Number number;
        public Consumer(Number number)
        {
            this.number=number;
            Thread t=new Thread(this,"Producer");
            t.start();
        }
        public void run(){
            int i=0;
            while(i<=20)
            {
                number.get();
                try{ Thread.sleep(1000); }
                catch(Exception e){};
            }
        }
}
