package core_java.inner_classes;

public class Demo {
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.show();
        MyClass.InnerClass obj2=obj.new InnerClass();
        obj2.method();
        MyClass.InnerClass2 obj3=new MyClass.InnerClass2();
        obj3.method();
    }
}
//Time Complexity: O(1)
//Space Complexity: O(N), where N is the number of objects