package excelsheetcolum;

public class NthPrimeNumber {

	public static void main(String[] args) {

		System.out.println(nthPrimeNumber(1049));
		
	}

	public static long nthPrimeNumber(int position) {
		if(position <= 1)
			return 2;
		int foundCount = 0;
		long number = 2;
		while (true) {
			if(isPrime(number)) {
				foundCount++;
			}
			
			if(position == foundCount) {
				break;
			}
			number++;
		}
		return number;
	}
	
	private static boolean isPrime(long number) {
		double sqrt = Math.sqrt(number);
		
		for(int i = 2; i <= sqrt ; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}

}
