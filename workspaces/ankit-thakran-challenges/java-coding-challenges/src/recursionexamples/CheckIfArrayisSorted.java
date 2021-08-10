package recursionexamples;

public class CheckIfArrayisSorted {
	//,13,26,28
	public static void main(String[] args) {
		Integer[] items = {7,9,11,14,23,23,29};
		System.out.println(chekLoop(items));
		
		System.out.println(chekRecursive(items, 0));
		
		System.out.println(chekRecursiveOpposite(items, items.length-1));
	}
	
	private static <T extends Comparable<T>> boolean chekLoop(T[] items) {
		//if array is null or it is empty it is sorted already
		if(items == null || items.length == 0) {
			return true;
		}
		
		boolean isSorted = true;
		T first = items[0];
		for(int i = 1; i < items.length ; i++) {
			T current = items[i];
			if(first.compareTo(current) > 0) {
				isSorted = false;
				break;
			}
			first = current;
		}
		
		return isSorted;
	}
	
	
	private static <T extends Comparable<T>> boolean chekRecursive(T[] items , int index) {
		
		if(items == null) {
			return false;
		}
		//null array / array whihc is empty or have only one element is always sorted
		int length = items.length;
		if(length == 0 || length == 1) {
			return true;
		}
		
		if(index  >= length-1) {
			return true;
		}
		
		if(items[index].compareTo(items[index+1]) > 0) {
			return false;
		}
		
		return chekRecursive(items, index+1);
		
		
	}
	
	private static <T extends Comparable<T>> boolean chekRecursiveOpposite(T[] items , int lastIndex) {
		
		if(items == null) {
			return false;
		}
		//null array / array whihc is empty or have only one element is always sorted
		int length = items.length;
		if(length == 0 || length == 1) {
			return true;
		}
		
		if(lastIndex <= 0) {
			return true;
		}
		
		if(items[lastIndex].compareTo(items[lastIndex-1]) < 0) {
			return false;
		}
		
		return chekRecursive(items, lastIndex-1);
		
		
	}
}
