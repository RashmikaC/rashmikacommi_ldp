package assignment_7.qun_4;

public class TricycleFactory implements CycleFactory{
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}
