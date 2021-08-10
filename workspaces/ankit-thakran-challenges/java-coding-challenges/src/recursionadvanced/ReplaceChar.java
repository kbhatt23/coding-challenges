package recursionadvanced;

public class ReplaceChar {

	public static void main(String[] args) {
		String str = "";
		char toReplace = 'k';
		char replacer = 'x';
		char[] charArray = str.toCharArray();
		replaceChars(charArray,toReplace,replacer);
		printChars(charArray);
		
		String str1 = "";
		char[] charArray2 = str1.toCharArray();
		replaceCharsRecursion(charArray2,toReplace,replacer,0);
		printChars(charArray2);
		
	}

	private static void replaceChars(char[] charArray, char toReplace, char replacer) {
		for(int i =0 ; i < charArray.length; i++) {
			if(charArray[i] == toReplace) {
				charArray[i] = replacer;
			}
		}
	}

	private static void printChars(char[] charArray) {
		StringBuilder stringBuilder = new StringBuilder();
		for(char c : charArray) {
			stringBuilder.append(c);
		}
		
		System.out.println(stringBuilder.toString());
	}
	
	private static void replaceCharsRecursion(char[] charArray, char toReplace, char replacer , int startIndex) {
		
		if(startIndex >= charArray.length) {
			return;
		}
		
		if(charArray[startIndex] == toReplace) {
			charArray[startIndex] = replacer;
		}
		
		replaceCharsRecursion(charArray, toReplace, replacer, startIndex+1);
	}
}


