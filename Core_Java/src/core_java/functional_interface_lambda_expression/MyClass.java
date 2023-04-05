package core_java.functional_interface_lambda_expression;

public class MyClass extends Object implements MyFunctionalInterface{

    @Override
    public void show() {
        System.out.println("Hi");
    }
}
// if we only use this class once, we can give an anonymous inner class