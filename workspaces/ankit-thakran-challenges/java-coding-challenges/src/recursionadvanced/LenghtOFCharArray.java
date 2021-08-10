package recursionadvanced;

public class LenghtOFCharArray {

	public static void main(String[] args) {
		char[] chars = {'a','b','c','c','c','c','c','c'};
		System.out.println(lengthREcursively(chars, 0));
		System.out.println(lengthREcursivelyTough(chars, 0));
	}
	
	//both below methods are same
	private static int lengthREcursively(char[] chars, int start) {
		if(start >= chars.length) {
			return 0;
		}
		
		//current char length is 1 and add for others
		return 1 + lengthREcursively(chars, start+1);
		
	}
	
	private static int lengthREcursivelyTough(char[] chars, int start) {
		if(start >= chars.length) {
			return 0;
		}
		
		int soFar = lengthREcursivelyTough(chars, start+1);
		
		return 1 + soFar;
		
	}
}
