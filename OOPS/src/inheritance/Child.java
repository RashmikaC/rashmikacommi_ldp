package inheritance;

public class Child implements ParentOne, ParentTwo {
    @Override
    public void method() {
        ParentTwo.super.method();
    }
}
