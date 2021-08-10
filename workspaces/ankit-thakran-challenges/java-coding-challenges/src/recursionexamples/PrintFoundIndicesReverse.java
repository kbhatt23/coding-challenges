package recursionexamples;

public class PrintFoundIndicesReverse {

	public static void main(String[] args) {
		int numToSearch = 6;
		int[] numbers = { 5, 5, 6, 5, 6, 7 };
		printFoundIndexLoop(numbers, numToSearch);
		System.out.println("===========");
		printFoundIndexRecursively(numbers, numToSearch, numbers.length-1);
		
		System.out.println("==========");
		
		//iterate from start but still print indices in reverse order
		printFoundIndexRecursivelyFromStart(numbers, numToSearch, 0);
	}

	private static void printFoundIndexLoop(int[] numbers, int numToSearch) {

		for (int i = numbers.length-1; i >=0; i--) {
			if (numbers[i] == numToSearch) {
				System.out.println("printFoundIndex.found index " + i);
			}
		}

	}

	private static void printFoundIndexRecursively(int[] numbers, int numToSearch , int endIndex) {
		if(endIndex < 0) {
			return;
		}
	
		if(numToSearch == numbers[endIndex]) {
			System.out.println("printFoundIndexRecursively.found index " + endIndex);
		}
		printFoundIndexRecursively(numbers, numToSearch,endIndex-1);

	}
	
	private static void printFoundIndexRecursivelyFromStart(int[] numbers, int numToSearch , int startIndex) {
		if(startIndex >= numbers.length) {
			return;
		}
	
		printFoundIndexRecursivelyFromStart(numbers, numToSearch,startIndex+1);
		if(numToSearch == numbers[startIndex]) {
			System.out.println("printFoundIndexRecursivelyFromStart.found index " + startIndex);
		}

	}
}
