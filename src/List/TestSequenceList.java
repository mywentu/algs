package List;

/**
 * Created by fajiao on 2017/3/26.
 */
public class TestSequenceList {
    public static void main(String[] args) {
        SequenceList list = new SequenceList(20);
        try {
            list.insert(0, 100);
            list.insert(0, 50);
            list.insert(1, 90);
            list.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}