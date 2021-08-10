package recursionexamples;

public class FindFirstIndexInArray {

	public static void main(String[] args) {
		int numToSearch = 6;
		int[] numbers = {5,5,6,5,6};
		System.out.println(findIndexLoop(numbers, numToSearch));
		
		System.out.println(findIndexRecursion(numbers, numToSearch, 0));
		
	}
	
	private static int findIndexLoop(int[] numbers , int numToSearch) {
		
		int indexFound = -1;
		
		for(int i = 0 ; i < numbers.length ; i++) {
			if(numToSearch == numbers[i])
			{
				indexFound = i; 
				break;
			}
		}
		
		return indexFound;
	}
	
	private static int findIndexRecursion(int[] numbers ,int numToSearch, int startIndex ) {
		//negatve base case
		if(startIndex >= numbers.length) {
			return -1;
		}
		
		//positive base case
		if(numToSearch == numbers[startIndex]) {
			return startIndex;
		}
		
		return findIndexRecursion(numbers, numToSearch, startIndex+1);
		
	}
	

}
