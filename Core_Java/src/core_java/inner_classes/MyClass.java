package core_java.inner_classes;

public class MyClass {
    int age;
   public MyClass(){
        age=0;
        System.out.println("In MyClass");
    }
    public void show(){
        System.out.println("In show");
    }

    class InnerClass{
        public void method(){
            System.out.println("In innerclass1");
        }
    }
    static class InnerClass2{
        public void method(){
            System.out.println("In innerclass2");
        }
    }
}
