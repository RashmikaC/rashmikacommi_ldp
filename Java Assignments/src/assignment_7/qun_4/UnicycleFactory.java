package assignment_7.qun_4;

public class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}
