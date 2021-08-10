package recursionexamples;

public class FactorialExample {

	public static void main(String[] args) {
		
		System.out.println(factorial(11));
	}
	
	private static long factorial(int number) {
		
		if(number == 0 )
			return 1l;
		
		return number * factorial(number-1);
	}
}
