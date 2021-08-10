package recursionexamples;

public class SumOfDigits {

	public static void main(String[] args) {
		long number = 1099;
		int sumOfCharsLoop = sumOfCharsLoop(number);
		System.out.println("sumOfCharsLoop "+sumOfCharsLoop);
		
		System.out.println("sumOfCharsRecursion "+sumOfCharsRecursion(number));
	}

	private static int sumOfCharsLoop(long number) {
		
		int sum = 0;
		
		while(number > 0) {
			sum += number % 10;
			number/=10;
		}
		
		return sum;
	}
	
	private static int sumOfCharsRecursion(long number) {
		if(number <= 0 ) {
			return 0;
		}
		
		//% 10 will always return single cahr which is destined to be int
		return sumOfCharsRecursion(number/10) + (int )number % 10;
		
	}
}
