package inheritance;

public interface ParentOne {
    default void method(){
        System.out.println("Method of parent one");
    }
}
