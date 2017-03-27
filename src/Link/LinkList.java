package Link;

import java.util.LinkedHashMap;

/**
 * Created by fajiao on 2017/3/25.
 */
public class LinkList implements List {
    Node head;
    Node current;
    int size;

    public LinkList() {
        this.head = current = new Node(null);
        this.size = 0;
    }
    public void index(int index) throws Exception {
        if(index < -1 || index > size -1){
            throw new Exception("参数错误");
        }
        if(index == -1) {
            return ;
        }
        current = head.next;
        int j = 0;
        while (current != null && j <index) {
            current = current.next;
            j++;
        }
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("参数错误");
        }
        index( index-1);
        current.setNext(new Node(obj, current.next));
        size++;
    }

    @Override
    public void delete(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("链表为空，无法删除！");
        }
        if(index < 0 || index > size){
            throw new Exception("参数错误！");
        }
        index(index - 1);
        current.setNext(current.next.next);
        size-- ;

    }

    @Override
    public Object get(int index) throws Exception {
        if(index < -1 || index > size-1){
            throw new Exception("参数错误！");
        }
        index(index);
        return current.getElement();
    }
}
