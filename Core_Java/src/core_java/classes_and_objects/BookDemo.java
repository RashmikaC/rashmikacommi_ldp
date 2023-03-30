package core_java.classes_and_objects;

public class BookDemo {
    public static void main(String[] arg)
    {
        Book javaBook=new Book("Joel","Java Programming","Programming",800);
        System.out.println("Author:"+javaBook.getAuthor());
        System.out.println("Title:"+javaBook.getTitle());
        System.out.println("Genre:"+javaBook.getGenre());
        System.out.println("num of pages:"+javaBook.getNumPages());
    }
}
//Time Complexity: O(1)
//Space complexity : O(N), where N is the number of Book objects