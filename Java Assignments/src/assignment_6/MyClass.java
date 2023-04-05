package assignment_6;

public class MyClass {
    public MyClass(String arg) {
        System.out.println("Initializing with argument: " + arg);
    }


    public static void main(String[] args) {
        MyClass[] myClassArray = new MyClass[5];
        // no objects are actually created in the array
    }
}

//Time Complexity:O(1)
//Space Complexity:O(5) = O(1)