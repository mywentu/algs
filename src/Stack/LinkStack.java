package Stack;

import Link.LinkList;
import Link.Node;

/**
 * Created by fajiao on 2017/3/27.
 */
public class LinkStack implements Stack{
    Node head;
    int size;
    public LinkStack() {
        head = null;
        size = 0;
    }
    @Override
    public void push(Object obj) throws Exception {
        head = new Node(obj, head);
        size++;
    }

    @Override
    public Object pop() throws Exception {
        if(isEmpty()) throw new Exception("栈为空！");
        Object obj = head.getElement();
        head = head.getNext();
        size--;
        return obj;
    }

    @Override
    public Object getTop() throws Exception {
        return head.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
