package core_java.threads.using_lambda_expression;

public class Demo {
    public static void main(String[] args){
//        Runnable obj1=()->{
//            for(int i=0;i<100;i++){
//                System.out.println("Hi");
//                try {
//                    Thread.sleep(10);
//                } catch (Exception e) {}
//            }
//        };
//        Runnable obj2=()->{
//            for(int i=0;i<100;i++)
//            {
//                System.out.println("Hello");
//                try {
//                    Thread.sleep(10);
//                } catch (Exception e) {}
//            }
//        };
//        Thread t1=new Thread(obj1);
//        Thread t2=new Thread(obj2);

        Thread t1=new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {}
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<100;i++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {}
            }
        });
        t1.start();
        t2.start();
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)