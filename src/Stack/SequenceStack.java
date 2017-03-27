package Stack;

import sun.invoke.empty.Empty;

/**
 * Created by fajiao on 2017/3/27.
 */
public class SequenceStack implements Stack {
    Object [] stack;
    final int defaultSize = 10;
    int top;
    int maxSize;

    public SequenceStack() {
        init(defaultSize);
    }
    public SequenceStack(int size) {
        init(size);
    }
    public void init(int size) {
        this.maxSize = size;
        top = 0;
        stack = new Object[size];
    }
    @Override
    public void push(Object obj) throws Exception {
        if(top == maxSize) throw new Exception("栈已满！");
        stack[top] = obj;
        top++;
    }

    @Override
    public Object pop() throws Exception {
        if(isEmpty()) throw new Exception("栈为空！");
        top--;
        return stack[top];
    }

    @Override
    public Object getTop() throws Exception {
        if(isEmpty()) throw new Exception("栈为空！");
        return stack[top -1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
