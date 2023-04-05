package example;

//public final class finalExample {
//    Cannot inherit from final 'example.finalExample'
public class finalExample {
    final int a=10;
    public void changeValue(){
//        a=11;
//        Cannot assign a value to final variable 'a'
    }
    public final void finalMethod(){
        System.out.println("This is final method");
    }
}
