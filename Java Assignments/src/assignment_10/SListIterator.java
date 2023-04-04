package assignment_10;

public class SListIterator<T> {
    Link<T> head;
    Link<T> current;
    SListIterator(Link<T> head) {
        this.current= head;
        this.head=head;
    }
    public void insert(T data) {
//        System.out.println("insert start head "+head.data+" curr"+current.data);

        if (head == null) {
            head = new Link<>(data);
            current = head;
        } else {
            current.next = new Link<>(data);
            current = current.next;
        }
//        System.out.println("insert end head "+head.data+" curr"+current.data);
    }
    public void remove() {
//        System.out.println("remove start head "+head.data+" curr"+current.data);
        if(head==null)
        {
            System.out.println("The list is empty cannot remove!");
            return;
        }
        head = head.next;
//        System.out.println("remove end head  "+head.data+" curr"+current.data);
    }

    public boolean hasNext() {
        return current.next != null;
    }
    public T next() {
        current = current.next;
        return current.data;
    }
    public String display() {
        if(head==null)
            System.out.println("The list is empty!");
        StringBuilder sb = new StringBuilder();
        Link<T> temp=new Link<>(null);
        temp.next=head;
        current =temp;
        while(hasNext()) {
            sb.append(next() + " ");
        }
        return sb.toString();
    }
}
