package assignment_5.rashmika.assignment.singleton;

public class Singleton {
    String str;
    static Singleton obj=new Singleton(); //thread safe => Eager Instantiation
    private Singleton(){

    }
    //Here we need to add a private constructor to ensure we cannot create another object at runtime.
    public static Singleton getInstance(String s){
//        Singleton obj=new Singleton();
        obj.str=s;
        return obj;
    }
    public void printString(){
        System.out.println(str);
    }
}
