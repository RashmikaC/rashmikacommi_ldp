package assignment_10;

public class Link<T> {
    T data;
    Link<T> next=null;

    Link(T data) {
        this.data = data;
    }
}
