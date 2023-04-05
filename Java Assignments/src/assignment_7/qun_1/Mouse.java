package assignment_7.qun_1;

public class Mouse extends Rodent{
    public Mouse() {
        System.out.println("This is a mouse.");
    }
    @Override
    public void eat() {
        System.out.println("The mouse is eating cheese.");
    }

    @Override
    public void run() {
        System.out.println("The mouse is running on its wheel.");
    }
}
