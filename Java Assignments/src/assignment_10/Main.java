package assignment_10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> list=new SList<>();
        SListIterator<Integer> iterator=new SListIterator<>(null);
        iterator.insert(10);
        iterator.insert(20);
        iterator.insert(30);
        System.out.println(iterator.display());
        iterator.remove();
        System.out.println(iterator.display());
        iterator.insert(40);
        System.out.println(iterator.display());
        iterator.remove();
        System.out.println(iterator.display());
        iterator.remove();
        System.out.println(iterator.display());
        iterator.remove();
        System.out.println(iterator.display());
        iterator.remove();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n), where n - number of elements in the list