package sort;

/**
 * Created by fajiao on 2017/3/16.
 */
public class bubbleSort {
    private static int []  myList =new  int[] {1, 9, 2, 89, 34, 30, 56, 99, 99, 100};
    private static void swap(int a, int b){
        int temp = myList[a];
        myList[a] = myList[b];
        myList[b] = temp;
    }
    public static void main(String[] args) {
        for(int j=1; j<myList.length; j++){
            for(int k=j-1; k<myList.length-1; k++){
                if(myList[k] > myList[k+1]){
                    swap(k ,k+1);
                }
            }
        }

        for (int aMyList : myList) {
            System.out.println(aMyList);
        }
    }
}