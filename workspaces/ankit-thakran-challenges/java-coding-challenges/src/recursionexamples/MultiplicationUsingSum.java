package recursionexamples;

public class MultiplicationUsingSum {

	public static void main(String[] args) {
		int x =4;
		int y = 4;
		
		long result = multiplyLoop(x,y);
		System.out.println("multiplyLoop: "+result);
		System.out.println("normal multiplcation "+(x*y));
		
		System.out.println("multiplyRecursion: "+multiplyRecursion(x, y));
	}

	private static long multiplyLoop(int x, int y) {
		int result = 0;
		for(int i = 0 ; i < y ; i++) {
			result += x;
		}
		return result;
	}
	
	private static long multiplyRecursion(int x, int y) {
		if(y == 0) {
			return 0;
		}
		if(y == 1) {
			return x;
		}
		
		long multiplyRecursion = multiplyRecursion(x, y-1);
		return multiplyRecursion + x; 
	}
}
