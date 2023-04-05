package assignment_6;

public class MyClass2 {
    public MyClass2(String arg) {
        System.out.println("Initializing with argument: " + arg);
    }

    public static void main(String[] args) {
        MyClass2[] myClassArray = new MyClass2[5];
        for (int i = 0; i < myClassArray.length; i++) {
            myClassArray[i] = new MyClass2("Object " + (i+1));
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)