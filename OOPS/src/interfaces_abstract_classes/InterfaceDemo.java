package interfaces_abstract_classes;

public interface InterfaceDemo {
    static final String a="static constant";
    public void m1();
    public int m2();
// require implementation in classes implementing them
    static void m3() {}
    default int m4(){return 0;}
//by default the implementation of this method is available to all the classes implementing this interface
    private void m5(){}
//    can be used in interface only. These are helper methods to other methods
}
