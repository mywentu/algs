package List;

/**
 * Created by fajiao on 2017/3/26.
 */
public interface List {
    public int size();
    public boolean isEmpty();
    public void insert(int index, Object obj) throws Exception;
    public void delete(int index) throws Exception;
    public Object get(int index) throws Exception;
    public void show();
}
