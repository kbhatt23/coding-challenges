package recursionexamples;

public class CountZeroes {

	public static void main(String[] args) {
		long number =1208;
		
		int countUsingLoop = countUsingLoop(number);
		
		System.out.println("countUsingLoop: "+countUsingLoop);
		
		System.out.println("countUsingRecursion: "+countUsingRecursion(number));
	}

	private static int countUsingLoop(long number) {
		
		if(number <= 0) {
			return 0;
		}
		
		int count = 0 ;
		while(number > 0) {
			//for number of any size last char will always be 1 sized and easily fit into int
			int lastChar = (int) number % 10;
			if(0 == lastChar)
				count ++;
			
			number /= 10;
		}
		
		return count;
		
	}
	
private static int countUsingRecursion(long number) {
	
	if(number <= 0) {
		return 0;
	}
	
	//break the problem
	//assume method will provide value for smaller subset
	int remainingCount = countUsingRecursion(number/10);
	
	int currentCount = (number % 10 == 0) ? 1: 0;
	return remainingCount + currentCount;
	
}
}
