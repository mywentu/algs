package array;

public class HighArrayApp {
	public static void main(String[] args) {
		int maxSize = 100;
		HighArray arr;
		arr = new HighArray(maxSize);
		arr.insert(89);
		arr.insert(32);
		arr.insert(34);
		arr.insert(3);
		arr.insert(9);
		arr.display();
		System.out.println("---------insert test-----------------");
		int searchKey = 34;
		int result = arr.find(searchKey);
		if(result != arr.length()){
			System.out.println(" Found " + searchKey + " in " + result );
		} else{
			System.out.println(" Not Found ");
		}
		System.out.println("---------find test-----------------");
		arr.delete(0);
		arr.delete(3);
		arr.display();
		System.out.println("---------delete test-----------------");	
	}
}