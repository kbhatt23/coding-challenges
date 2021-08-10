package removeadjacentduplicates;

public class ReverseInt {

	public static void main(String[] args) {
		int number=123;
		
		int convertToString = reverseInt(number);
		System.out.println(convertToString);
	}

	private static int reverseInt(int number) {
		int reverse = 0;
		while(number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 +remainder;
			number /= 10;
		}
		
		return reverse;
	}
}
