package assignment_7.qun_3;

public class MyClass extends ConcreteClass implements CombinedInterface{
    @Override
    public void newMethod() {
        System.out.println("New method of MyClass");
    }

    @Override
    public void method1a() {
        System.out.println("Method 1a of MyClass");
    }

    @Override
    public void method1b() {
        System.out.println("Method 1b of MyClass");
    }

    @Override
    public void method2a() {
        System.out.println("Method 2a of MyClass");
    }

    @Override
    public void method2b() {
        System.out.println("Method 2b of MyClass");
    }

    @Override
    public void method3a() {
        System.out.println("Method 3a of MyClass");
    }

    @Override
    public void method3b() {
        System.out.println("Method 3b of MyClass");
    }
    void method1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }
    void method2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }

    void method3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }
    void methodCombined(CombinedInterface obj) {
        obj.method1a();
        obj.method1b();
        obj.method2a();
        obj.method2b();
        obj.method3a();
        obj.method3b();
        obj.newMethod();
    }
}