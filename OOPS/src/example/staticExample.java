package example;

public class staticExample {
    int a=0;
    static int b=10;
    public static void display()
    {
        System.out.println("The value is"+b);
        //Non-static field 'a' cannot be referenced from a static context
    }

//    we can directly access the static method without creating an object
//            staticExample.display()
}
