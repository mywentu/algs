package sort;

/**
 * Created by fajiao on 2017/3/17.
 */
public class InsertSort {
    private static int []  myList =new  int[] {1, 9, 2, 89, 34, 30, 56, 99, 99, 100};
    private static void swap(int a, int b){
        int temp = myList[a];
        myList[a] = myList[b];
        myList[b] = temp;
    }

    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i < myList.length; i++) {
            for( j = i; j < myList.length; j++) {
                if(myList[j] < myList[j-1]) {
                    swap(j, j-1);
                }
            }
        }

        for (int aMyList : myList) {
            System.out.println(aMyList);
        }
    }
}
