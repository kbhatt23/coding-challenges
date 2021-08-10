package recursionexamples;

public class FindLastIndex {

	public static void main(String[] args) {
		int numToSearch = 6;
		int[] numbers = {5,5,6,5,6,7};
		
		System.out.println(findLastIndexLoop(numbers, numToSearch));
		System.out.println(findLastIndexRecursion(numbers, numToSearch, numbers.length-1));
		
		System.out.println(findLastIndexRecursionFromStart(numbers, numToSearch, 0));
	}
	
	
	private static int findLastIndexLoop(int[] numbers, int numToSearch) {
		int index = -1;
		
		for(int i = numbers.length-1 ; i >=0 ; i--) {
			if(numbers[i] == numToSearch) {
				index = i;
				break;
			}
		}
		
		return index;
		
	}


	private static int findLastIndexRecursion(int[] numbers ,int numToSearch, int endIndex ) {
		//negatve base case
		if(endIndex < 0 ) {
			return -1;
		}
		
		//positive base case
		if(numToSearch == numbers[endIndex]) {
			return endIndex;
		}
		
		return findLastIndexRecursion(numbers, numToSearch, endIndex-1);
		
	}
	
	private static int findLastIndexRecursionFromStart(int[] numbers ,int numToSearch, int startIndex ) {
	
		if(startIndex >= numbers.length) {
			return -1;
		}
		
		int index = findLastIndexRecursionFromStart(numbers, numToSearch, startIndex+1);
		
		if(index == -1 && numbers[startIndex] == numToSearch) {
			//check current index
			return startIndex;
		}else {
			return index;
		}
	}
}
