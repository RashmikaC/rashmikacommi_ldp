package assignment_7.qun_4;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}
