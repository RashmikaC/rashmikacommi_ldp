package core_java.wrapper_classes;

public class Demo {
    public static void main(String[] args){
        int num=8;

//        Integer num1=new Integer(8);// boxing or wrapping

        Integer num1=num; //autoboxing => assigning primitive type to object type


//        int num2=num1.intValue();//unboxing or unwrapping

        int num2=num1;//auto-unboxing => fetch the primitive type automatically
        System.out.println(num2);

        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
//Time Complexity: O(1)
//Space Complexity: O(1)