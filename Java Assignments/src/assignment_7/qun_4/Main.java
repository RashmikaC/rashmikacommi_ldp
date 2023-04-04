package assignment_7.qun_4;

public class Main {
    public static void main(String[] args){
        CycleFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.createCycle();
        unicycle.ride();

        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.createCycle();
        bicycle.ride();

        CycleFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.createCycle();
        tricycle.ride();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)