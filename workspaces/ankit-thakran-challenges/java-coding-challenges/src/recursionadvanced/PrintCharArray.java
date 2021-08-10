package recursionadvanced;

public class PrintCharArray {

	public static void main(String[] args) {
		char[] chars = {'a','b','c'};
		
		printChars(chars);
		System.out.println("=============");
		
		printRecursively(chars, 0);
		System.out.println("=============");
		
		printRecursivelyReverseEasy(chars, chars.length-1);
		
		System.out.println("=============");
		
		printRecursivelyReverseTough(chars, 0);
		System.out.println("=============");
	}

	private static void printChars(char[] chars) {
		for(char c : chars) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	private static void printRecursively(char[] chars, int startIndex) {
		
		if(startIndex >= chars.length) {
			System.out.println();
			return;
		}
		
		System.out.print(chars[startIndex]);
		printRecursively(chars, startIndex+1);
	}
	
	private static void printRecursivelyReverseEasy(char[] chars, int endIndex) {
		
		if(endIndex < 0) {
			System.out.println();
			return;
		}
		
		System.out.print(chars[endIndex]);
		printRecursivelyReverseEasy(chars, endIndex - 1);
	}
	private static void printRecursivelyReverseTough(char[] chars, int startIndex) {
		if(startIndex >= chars.length) {
			return;
		}
		printRecursivelyReverseTough(chars, startIndex+1);
		System.out.print(chars[startIndex]);
	}
}
