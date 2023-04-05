package polymorphism.overriding;

public class Car extends Vehicle{
    //static
    public void run(){
//        super.run();
        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        Vehicle v=new Car();
        v.run();
    }
}
//late binding or run time binding