package dry.correction;

public class Laundry {
    public void washWhiteClothes() {
        System.out.println("Putting in white clothes");
        performCommonTasks();
    }

    public void washColorfulClothes() {
        System.out.println("Putting in colorful clothes");
        performCommonTasks();
    }
    public void performCommonTasks(){
        //filling water to washing machine, setting configuration
        //draining out water
    }
}
// single unambiguous authoritative representation
//DRY => Don't Repeat Yourself