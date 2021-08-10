package recursionexamples;

public class PrintFoundIndices {

	public static void main(String[] args) {
		int numToSearch = 5;
		int[] numbers = { 5, 5, 6, 5, 6, 7 };
		printFoundIndexLoop(numbers, numToSearch);
		System.out.println("===========");
		printFoundIndexRecursively(numbers, numToSearch, 0);
	}

	private static void printFoundIndexLoop(int[] numbers, int numToSearch) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numToSearch) {
				System.out.println("printFoundIndex.found index " + i);
			}
		}

	}

	private static void printFoundIndexRecursively(int[] numbers, int numToSearch , int startIndex) {
		if(startIndex >= numbers.length) {
			return;
		}
	
		if(numToSearch == numbers[startIndex]) {
			System.out.println("printFoundIndexRecursively.found index " + startIndex);
		}
		printFoundIndexRecursively(numbers, numToSearch,startIndex+1);

	}
}
