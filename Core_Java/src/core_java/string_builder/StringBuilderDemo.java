package core_java.string_builder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("John Baugh");
        sb.append(" is awesome");
        System.out.println(sb);
        sb.insert(5,"Phillip ");
        System.out.println(sb);
        sb.replace(22,29,"amazing");
        System.out.println(sb);
        sb.delete(5,13);
        System.out.println(sb);
    }
}
//Time complexity:O(n+m)
//Space Complexity:O(n+m), where n is the length of the initial string and m is the length of the appended, inserted, or replaced strings