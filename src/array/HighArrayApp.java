package array;

public class HighArrayApp {
	public static void main(String[] args) {
		int maxSize = 100;
		HighArray arr;
		arr = new HighArray(maxSize);
		arr.insert(1);
		arr.insert(3);
		arr.insert(45);
		arr.insert(67);
		arr.insert(100);
		arr.display();
		System.out.println("---------insert test-----------------");
		int searchKey = 3;
		int result = arr.find(searchKey);
		if(result != arr.length()){
			System.out.println(" Found " + searchKey + " in " + result );
		} else{
			System.out.println(" Not Found ");
		}
		System.out.println("---------find test-----------------");
		System.out.println("---------binary search only sorted-----------------");
		arr.delete(0);
		arr.delete(3);
		arr.display();
		System.out.println("---------delete test-----------------");	
	}
}