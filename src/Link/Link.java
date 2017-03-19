package Link;

/**
 * Created by fajiao on 2017/3/19.
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }
    public void displayLink() {
        System.out.print("{"+ iData + "," + dData + "}");
    }
}

class LinkList {
    private Link first;

    public void LinkList() {
        first = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if(current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }

        }
        if(current == first) first = first.next;
        return current;

    }
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void displayList() {
        System.out.print("List (first --> last):");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}

class LinkApp{
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        System.out.println(theList.find(66));

        theList.displayList();
    }
}