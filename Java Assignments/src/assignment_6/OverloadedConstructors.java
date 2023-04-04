package assignment_6;

public class OverloadedConstructors {
        private int value1;
        private int value2;

        public OverloadedConstructors() {
            this(0); // Call constructor with default value
        }

        public OverloadedConstructors(int value1) {
            this(value1, 0); // Call constructor with value1 and default value2
        }

        public OverloadedConstructors(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public int getValue1() {
            return value1;
        }

        public int getValue2() {
            return value2;
        }

}
//constructor chaining