package Link;

/**
 * Created by fajiao on 2017/3/27.
 */
public class TestLinkList {
    public static void main(String[] args) throws Exception {
        LinkList list = new LinkList();
        for( int i = 0; i < 10; i++) {
            int temp = ((int)(Math.random()* 100)) % 100;
            list.insert(i, temp);
            System.out.print(temp+ " ");
        }
        list.delete(4);
        System.out.println("\n ------删除第五个元素后------");
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
