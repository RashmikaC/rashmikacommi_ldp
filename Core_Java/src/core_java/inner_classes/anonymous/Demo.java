package core_java.inner_classes.anonymous;

public class Demo {
    public static void main(String[] args){
//        MyClass obj=new ChildClass();
//        obj.show();
        MyClass obj=new MyClass(){
            public void show(){
                System.out.println("In new implementation");
            }
            // anonymous inner class
        };
        obj.show();
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)