package recursionexamples;

public class PowerRecursion {

	public static void main(String[] args) {
		int number = 25;
		int power = 12;
		System.out.println(power(number, power));
		
		System.out.println(Math.pow(number, power));
		
		System.out.println(powerRecursion(number, power));
	}
	
	private static long power(int number, int power) {
		long result = 1;
		
		for(int i = 0 ; i < power ; i++) {
			result *= number;
		}
		return result; 
	}
	
	//we need to see if smaller prblem have same solution as the current method
	private static long powerRecursion(int number, int power) {
		if(power == 0)
			return 1;
		
		//saves one stack push
		if(power == 1)
			return number;
		
		return number * powerRecursion(number, power-1);
		
	}
}
