package List;

/**
 * Created by fajiao on 2017/3/26.
 */
public class SequenceList implements List {
    final int defaultSize = 10;
    int maxSize;
    int size;
    int getDefaultSize;
    Object[] listArray;

    public SequenceList() {
        init(defaultSize);
    }
    public SequenceList(int size) {
        init(size);
    }

    private void init(int size) {
        maxSize = size;
        this.size = 0;
        listArray = new Object[size];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {
        if(size == maxSize)  throw new Exception("顺序表已满，无法插入！");
        if(index < 0 || index > maxSize) throw new Exception("参数错误");
        for(int j = size - 1; j >= index; j--) {
            listArray[j+1] = listArray[j];
        }
        listArray[index] = obj;
        size++;
    }

    @Override
    public void delete(int index) throws Exception {
        if(isEmpty()) throw new Exception("顺序表为空，无法删除!");
        if(index < 0 || index > maxSize) throw new Exception("参数错误！");
        for (int j = index; j < size -1; j++) {
            listArray[j] = listArray[j+1];
        }
        size--;

    }

    @Override
    public Object get(int index) throws Exception {
        if(index < 0 || index >=size) throw new Exception("参数错误！");
        return listArray[index];
    }

    @Override
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.printf(listArray[i] + " ");
        }
    }
}
