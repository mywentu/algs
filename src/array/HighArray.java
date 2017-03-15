package array;

public class HighArray {
	private long[] a;
	private int nElems;
	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	public int find(long searchKey) {
		int l = 0;
		int r = nElems - 1;
		int curIndex;
		while(true) {
			curIndex = ( l + r) /2;
			if(a[curIndex] == searchKey) {
				return curIndex;
			}else if(l > r) {
				return nElems;
			}else{
				if(a[curIndex] < searchKey)
					l = curIndex + 1;
				else 
					r = curIndex - 1;
			}
		}
	}
	public void insert(long value) {
		a[nElems] = value;
		nElems ++;
	}
	public int  length() {
		return a.length;
	}
	public boolean delete(long value) {
		int j;
		for(j=0; j<nElems; j++){
			if(value == a[j])
				break;
		}
		if(j==nElems) {
			return false; //not found value
		} else {
			for(int k=j; k<nElems; k++)
				a[k] = a[k+1];
			nElems--;
			return true;
		}
		
	}
	public void display() {
		for(int j=0; j<nElems; j++){
			System.out.println(a[j]+ " ");
		}
	}
}






















