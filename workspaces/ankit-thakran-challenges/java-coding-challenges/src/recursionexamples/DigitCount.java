package recursionexamples;

public class DigitCount {

	public static void main(String[] args) {
		long number=2323323;
		System.out.println(countLoop(number));
		System.out.println(countRecursion(number));
	}
	
	private static int countLoop(long number) {
		if(number < 0) {
			return -1;
		}
		int length = 0;
		while(number > 0 ) {
			length++;
			number =number/10;
		}
		return length;
	}
	
	
	private static int countRecursion(long number) {
		//less than zero means bad case
		if(number < 0) {
			return -1;
		}
		
		if(number < 10) {
			return 1;
		}
		
		//count of current char + reamining chars
		//current cahr is 1 and one we divide with 10 last char is released and we are left with other elements
		return 1 + countRecursion(number/10);
	}
}
