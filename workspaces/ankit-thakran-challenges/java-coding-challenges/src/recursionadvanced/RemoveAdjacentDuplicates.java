package recursionadvanced;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String str = "aaaaabcbbcdeee";

		System.out.println(removeAdjacent(str));
		
		System.out.println(removeAdjacent2(str));
	}

	private static String removeAdjacent(String str) {
		if (str == null || str.length() == 0 || str.length() == 1) {
			return str;
		}

		// it will come here when minimum 2 chars are present
		StringBuilder stringBuilder = new StringBuilder();

		char charToTraverse = str.charAt(0);
		stringBuilder.append(charToTraverse);

		for (int i = 1; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (charToTraverse != currentChar) {
				stringBuilder.append(currentChar);
				charToTraverse = currentChar;
			}
		}

		return stringBuilder.toString();
	}

	public static String removeAdjacent2(String str) {
		if (str == null || str.length() == 0 || str.length() == 1) {
			return str;
		}
		// atleast 2 chars
		StringBuilder stringBuilder = new StringBuilder();
		char firstChar = str.charAt(0);
		stringBuilder.append(firstChar);
		removeAdjacentRecursively(str, firstChar, 1, stringBuilder);
		return stringBuilder.toString();
	}

	private static void removeAdjacentRecursively(String str, char charToTraverse, int index,
			StringBuilder stringBuilder) {
		if (index >= str.length()) {
			return;
		}

		char currentChar = str.charAt(index);
		if (charToTraverse != currentChar) {
			stringBuilder.append(currentChar);
			charToTraverse = currentChar;
			
		}
		removeAdjacentRecursively(str, charToTraverse, index + 1, stringBuilder);
	}
}
