package core_java.threads.synchronized_method;

public class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}
