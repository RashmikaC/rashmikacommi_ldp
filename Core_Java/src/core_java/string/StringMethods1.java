package core_java.string;

public class StringMethods1 {
    public static void main(String[] args) {
        String name="John";
        String name2="John";
        String name3="Rob";
        for(int i=0;i<name.length();i++)
            System.out.print(name.charAt(i)+" ");
        System.out.println();
        if(name.equals(name2))
            System.out.println("Names are equal");
        if(name.compareTo(name3)<0)
            System.out.println(name3+" is greater than "+name);

    }
}
//Time Complexity: O(n), where n is the length of the input string name
//Space Complexity: O(1), as it only creates three string variables (name, name2, and name3), which occupy a fixed amount of memory.