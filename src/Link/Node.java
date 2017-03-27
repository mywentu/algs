package Link;

/**
 * Created by fajiao on 2017/3/25.
 */
public class Node {
    Object element;
    Node next;

    public Node(Node nextval) {
        next = nextval;
    }

    public Node(Object obj, Node nextval) {
        this.element = obj;
        this.next = nextval;
    }

    public Node getNext() {
        return this.next;
    }

    public Object getElement() {
        return this.element;
    }

    public void setNext(Node nextval) {
        this.next = nextval;
    }

    public void setElement(Object obj) {
        this.element = obj;
    }

    public String toString() {
        return this.element.toString();
    }
}
