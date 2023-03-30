package core_java.inner_classes.anonymous;

public class ChildClass extends MyClass{
    public void show(){
        System.out.println("In ChildClass");
    }
}
// if we only use this class once, only for this particular use
// MyClass obj=new ChildClass();  obj.show();