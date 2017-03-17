package sort;

/**
 * Created by fajiao on 2017/3/17.
 */
public class SelectSort {
    private static int []  myList =new  int[] {1, 9, 2, 89, 34, 30, 56, 99, 99, 100};
    private static void swap(int a, int b){
        int temp = myList[a];
        myList[a] = myList[b];
        myList[b] = temp;
    }
    public static void main(String[] args) {
        int index, j, k;
        for( j=0; j<myList.length; j++){
            index = j;
            for(k=j+1; k< myList.length; k++){
                if(myList[k] < myList[index]) {
                    index = k;
                }
            }
            if(index != j){
                swap(index, j);
            }
        }
        for (int aMyList : myList) System.out.println(aMyList);
    }
}
