package recursionexamples;

public class SumOFArrayElements {

	public static void main(String[] args) {
		int[] numbers= {11,10,10,10,5,5};
		System.out.println(sumRecursion(numbers, 0));
		System.out.println(sumRecursionReverse(numbers, numbers.length-1));
	}
	
	private static long sumRecursion(int[] numbers, int index) {
		
		if(numbers == null || numbers.length == 0 ) {
			return 0;
		}
		
		int length = numbers.length;
		
		if(length == 1) {
			return numbers[0];
		}
		if(index >= length) {
			return 0;
		}
		return numbers[index] + sumRecursion(numbers, index+1);
		
	}
	
	private static long sumRecursionReverse(int[] numbers, int reverseIndex) {
		
		
		if(numbers == null || numbers.length == 0 ) {
			return 0;
		}
		
		int length = numbers.length;
		
		if(length == 1) {
			return numbers[0];
		}
		if(reverseIndex < 0) {
			return 0;
		}
		return numbers[reverseIndex] + sumRecursionReverse(numbers, reverseIndex-1);
		
	}

}
