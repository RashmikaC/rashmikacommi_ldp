package assignment_10;

public class SList<T> {
    Link<T> head=new Link<>(null);
    public SListIterator<T> iterator() {
        return new SListIterator<T>(head);
    }

//    public String toString() {
//        SListIterator<T> iterator = iterator();
//        StringBuilder sb = new StringBuilder();
//        while(iterator.hasNext()) {
//            sb.append(iterator.next() + " ");
//        }
//        return sb.toString();
//    }
}
