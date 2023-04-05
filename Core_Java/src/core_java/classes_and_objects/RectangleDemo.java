package core_java.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] arg)
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,10);
        System.out.println(Rectangle.getNumRectangles());
        Rectangle r3;
        System.out.println("After r3 declared "+Rectangle.getNumRectangles());
        r3=new Rectangle(6.5,3.7);
        System.out.println("After r3 initialized "+Rectangle.getNumRectangles());
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());

    }
}
//Time Complexity: O(1)
//Space complexity : O(N), where N is the number of Rectangle objects