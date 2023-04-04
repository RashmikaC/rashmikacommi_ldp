package assignment_7.qun_5;

public class OuterClass {

    private int outerData;

    public OuterClass(int outerData) {

        this.outerData = outerData;
    }

    public int getOuterData() {
        return outerData;
    }

    public class InnerClass {

        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        public int getInnerData() {
            return innerData;
        }
    }
}