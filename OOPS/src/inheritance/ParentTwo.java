package inheritance;

public interface ParentTwo {
    default void method(){
        System.out.println("Method of parent two");
    }
}
