package stack;

/**
 * Created by fajiao on 2017/3/18.
 */
public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j){
        stackArray[++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize-1;
    }
    public void show() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }

}

class StackApp {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push(1);
        theStack.push(4);
        theStack.push(5);
        theStack.pop();
        theStack.show();
    }

}