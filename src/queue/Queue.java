package queue;

/**
 * Created by fajiao on 2017/3/19.
 */

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize) rear = -1;
        queArray[++rear] = j;
        nItems ++;
    }

    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void show() {
        for (int i = 0; i <= nItems; i++) {
            System.out.println(queArray[i]);
        }
    }
}

class QueueApp {
    public static void main(String[] args){
        Queue theQueue = new Queue(10);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);

        theQueue.remove();
        theQueue.show();
    }
}
