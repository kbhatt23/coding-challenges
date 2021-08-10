package longestPrefix;

import java.util.Arrays;

public class LongestPrefix {

	public static void main(String[] args) {
		String[] words = { "geeksforgeeks", "geeks", "geek" , "geezer" };

		System.out.println(longestPrefix(words));
	}

	private static String longestPrefix(String[] words) {
		// never return null
		if (Arrays.stream(words).anyMatch(word -> word == null || word.length() == 0))
			return "";

		StringBuilder sb = new StringBuilder();

		int minLengthArray = findMinLength(words);

		outer: for (int i = 0; i < minLengthArray; i++) {
			char charToComapre = words[0].charAt(i);
			boolean isCharEqual = true;
			for (int k = 1; k < words.length; k++) {
				if (words[k].charAt(i) != charToComapre) {
					isCharEqual = false;
					break outer;
				}
			}
			if (isCharEqual)
				sb.append(charToComapre);
		}

		return sb.toString();
	}

	private static int findMinLength(String[] words) {
		int smallestLength = words[0].length();

		for (int i = 1; i < words.length; i++) {
			int wordLength = words[i].length();
			if (wordLength < smallestLength)
				smallestLength = wordLength;
		}
		return smallestLength;
	}
}
