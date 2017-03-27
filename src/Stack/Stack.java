package Stack;

/**
 * Created by fajiao on 2017/3/27.
 */
public interface Stack {
    public void push(Object obj) throws Exception;
    public Object pop() throws Exception;
    public Object getTop() throws Exception;
    public boolean isEmpty();
}
