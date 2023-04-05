package assignment_7.qun_5;

public class SecondOuterClass {

    public class SecondInnerClass extends OuterClass.InnerClass {
        public SecondInnerClass(OuterClass outer, int innerData) {
            outer.super(innerData);
        }
    }
}

//Time complexity: O(1)
//Space complexity: O(1)