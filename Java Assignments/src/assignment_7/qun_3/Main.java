package assignment_7.qun_3;

import static assignment_7.qun_3.MyClass.*;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1((Interface1) obj);
        obj.method2(obj);
        obj.method3(obj);
        obj.methodCombined(obj);
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)