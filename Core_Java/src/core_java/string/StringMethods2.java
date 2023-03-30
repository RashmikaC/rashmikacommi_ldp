package core_java.string;

public class StringMethods2 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String upper=name.toUpperCase();
        String lower=name.toLowerCase();
        int bIndex=name.indexOf("B");
        String lastName=name.substring(5);
        System.out.println("upper is: "+upper);
        System.out.println("lower is: "+lower);
        System.out.println("B is at index: "+bIndex);
        System.out.println("Last name: "+lastName);
    }
}
//Time Complexity: O(n),where n is the length of the input string name
//Space Complexity: O(n),because the program creates several new strings that are the same length as the input string name