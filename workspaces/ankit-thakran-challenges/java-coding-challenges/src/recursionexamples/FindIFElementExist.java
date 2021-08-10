package recursionexamples;

public class FindIFElementExist {

	public static void main(String[] args) {
		Integer[] items = {2,11,5,12};
		
		System.out.println(isExistsLoop(items, 1));
		
		System.out.println(isExistsRecursiveV2(items, 1, 0 ));
		
		System.out.println(isExistsRecursive(items, 1, 0));
		
		System.out.println(isExistsRecursiveReverse(items, 1 , items.length-1));

	}

	private static <T> boolean isExistsLoop(T[] items, T itemToSearch) {
		
		//if array is null no way item can be present there even though valid itemToSearch is passed
		//assuming non null itemToSearch item
		if(items == null || itemToSearch == null) {
			return false;
		}
		boolean exists = false;
		for (T item : items) {
			if (item.equals(itemToSearch)) {
				exists = true;
				break;
			}
		}

		return exists;
	}
	
	
	private static <T> boolean isExistsRecursive(T[] items, T itemToSearch , int index) {
		
		//base conditions in valid
		//if array is null no way item can be present there even though valid itemToSearch is passed
		//assuming non null itemToSearch item
		if(items == null || items.length == 0 || itemToSearch == null) {
			return false;
		}
		
		//base conditions valid
		//unable to find data untill all index are iterated
		if(index >= items.length) {
			return false;
		}
		
		
		if(items[index].equals(itemToSearch)) {
			return true;
		}

		return isExistsRecursive(items, itemToSearch, index+1);
	}
	private static <T> boolean isExistsRecursiveV2(T[] items, T itemToSearch , int index) {
		
		//base conditions in valid
		//if array is null no way item can be present there even though valid itemToSearch is passed
		//assuming non null itemToSearch item
		if(items == null || items.length == 0 || itemToSearch == null) {
			return false;
		}
		
		//base conditions valid
		//unable to find data untill all index are iterated
		if(index >= items.length) {
			return false;
		}
		
		if(isExistsRecursiveV2(items, itemToSearch, index+1)) {
			return true;
		}
		if(items[index].equals(itemToSearch)) {
			return true;
		}

		return false;
	}
	
private static <T> boolean isExistsRecursiveReverse(T[] items, T itemToSearch , int endIndex) {
		
		//base conditions in valid
		//if array is null no way item can be present there even though valid itemToSearch is passed
		//assuming non null itemToSearch item
		if(items == null || items.length == 0 || itemToSearch == null) {
			return false;
		}
		
		//base conditions valid
		//unable to find data untill all index are iterated
		if(endIndex < 0 ) {
			return false;
		}
		
		
		if(items[endIndex].equals(itemToSearch)) {
			return true;
		}

		return isExistsRecursiveReverse(items, itemToSearch, endIndex-1);
	}
}
