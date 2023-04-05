package assignment_7.qun_1;

public class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("This is a gerbil.");
    }
    @Override
    public void eat() {
        System.out.println("The gerbil is eating seeds.");
    }

    @Override
    public void run() {
        System.out.println("The gerbil is running in its cage.");
    }
}
