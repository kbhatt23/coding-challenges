package recursionexamples;

public class CountFoundIndicesReverse {

	public static void main(String[] args) {
		int numToSearch = 5;
		int[] numbers = { 5, 5, 6, 5, 6, 7 };
		System.out.println(printFoundIndexLoop(numbers, numToSearch));
		System.out.println("===========");
		System.out.println(printFoundIndexRecursively(numbers, numToSearch, numbers.length-1));
		
		System.out.println("============");
		System.out.println(printFoundIndexRecursivelyUsingForward(numbers, numToSearch, 0));
	}

	private static int printFoundIndexLoop(int[] numbers, int numToSearch) {
		int count = 0 ;
		for (int i =  numbers.length-1; i >= 0; i--) {
			if (numbers[i] == numToSearch) 
				count++;
			
		}
		return count;

	}

	private static int printFoundIndexRecursively(int[] numbers, int numToSearch , int endIndex) {
		if(endIndex < 0) {
			return 0;
		}
		if(numToSearch == numbers[endIndex]) {
			return 1 + printFoundIndexRecursively(numbers, numToSearch, endIndex-1);
		}else {
			return printFoundIndexRecursively(numbers, numToSearch, endIndex-1);
		}
	}
	
	private static int printFoundIndexRecursivelyUsingForward(int[] numbers, int numToSearch , int startIndex) {
		if(startIndex  >= numbers.length) {
			return 0;
		}
		
		int othersCount = printFoundIndexRecursivelyUsingForward(numbers, numToSearch, startIndex + 1);
		if(numToSearch == numbers[startIndex]) {
			return 1 + othersCount;
		}else {
			return othersCount;
		}
	}
}
