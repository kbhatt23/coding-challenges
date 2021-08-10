package recursionadvanced;

public class RemoveCharsFromString {

	public static void main(String[] args) {
		String str = "hello";
		
		char replacer = 'o';
		System.out.println(removeLoop(str, replacer));
		
		System.out.println(removeReal(str, replacer));
	}
	
	private static String removeLoop(String str , char charachterToReplace) {
		StringBuilder stringBuilder = new StringBuilder();
		for(char charachter : str.toCharArray()) {
			if(charachter != charachterToReplace)
				stringBuilder.append(charachter);
		}
		
		return stringBuilder.toString();
	}
	public static String removeReal(String str , char charachterToReplace) {
		return removeLoopRecursion(str, charachterToReplace, str.length()-1).toString();
	}
	
	private static StringBuilder removeLoopRecursion(String str , char charachterToReplace, int endIndex) {
		
		if(endIndex < 0) {
			//after last element pass the stringbuilder 
			return new StringBuilder();
		}

		StringBuilder removedByOthers = removeLoopRecursion(str, charachterToReplace, endIndex - 1);
		
		char currentChar = str.charAt(endIndex);
		if(currentChar != charachterToReplace)
			removedByOthers.append(currentChar);
		
		return removedByOthers;
	}
}
