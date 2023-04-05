package core_java.functional_interface_lambda_expression;

public class Demo {
    public static void main(String[] args) {
//        MyFunctionalInterface m=new MyClass();
//        m.show();
//        MyFunctionalInterface m=new MyFunctionalInterface() {
//            public void show() {
//                System.out.println("Hi in anonymous inner class");
//            }
//        };
//        MyFunctionalInterface m=() -> {
//                System.out.println("Hi in lambda expression");
//            };
        MyFunctionalInterface m=() -> System.out.println("Hi in lambda expression");;
        m.show();
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)