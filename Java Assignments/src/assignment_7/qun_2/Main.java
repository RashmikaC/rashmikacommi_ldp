package assignment_7.qun_2;

public class Main {
    public static void main(String[] args){
        // Upcast and call balance() on each element
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            } else {
                System.out.println("This cycle does not have balance method");
            }
        }
        // Downcast and call balance() on each element
        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                Unicycle unicycle=(Unicycle)cycle;
                unicycle.balance();
            } else if (cycle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) cycle;
                bicycle.balance();
            } else {
                System.out.println("This cycle does not have balance method");
            }
        }
    }
}

//Time complexity: O(1)
//Space complexity: O(1)