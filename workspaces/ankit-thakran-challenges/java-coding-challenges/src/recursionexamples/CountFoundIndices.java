package recursionexamples;

public class CountFoundIndices {

	public static void main(String[] args) {
		int numToSearch = 8;
		int[] numbers = { 5, 5, 6, 5, 6, 7 };
		System.out.println(printFoundIndexLoop(numbers, numToSearch));
		System.out.println("===========");
		System.out.println(printFoundIndexRecursively(numbers, numToSearch, 0));
	}

	private static int printFoundIndexLoop(int[] numbers, int numToSearch) {
		int count = 0 ;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numToSearch) 
				count++;
			
		}
		return count;

	}

	private static int printFoundIndexRecursively(int[] numbers, int numToSearch , int startIndex) {
		if(startIndex >= numbers.length) {
			return 0;
		}
		if(numToSearch == numbers[startIndex]) {
			return 1 + printFoundIndexRecursively(numbers, numToSearch, startIndex+1);
		}else {
			return printFoundIndexRecursively(numbers, numToSearch, startIndex+1);
		}
	}
}
