package assignment_7.qun_1;

public class Hamster extends Rodent{
    public Hamster() {
        System.out.println("This is a hamster.");
    }
    @Override
    public void eat() {
        System.out.println("The hamster is eating pellets.");
    }

    @Override
    public void run() {
        System.out.println("The hamster is running on its wheel.");
    }
}
