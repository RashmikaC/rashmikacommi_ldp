package polymorphism.overloading;

public class Add {
    public void sum(int a, int b)
    {
        System.out.println("Sum is :"+(a+b));
    }
    public void sum(double a, double b)
    {
        System.out.println("Sum is :"+(a+b));
    }
    public void sum(int a, int b,int c)
    {
        System.out.println("Sum is :"+(a+b+c));
    }
}
//early binding
//return type is not considered
//implicit type conversion
//byte -> short -> int -> long -> float -> double
//                  ^
//                  |
//                 char