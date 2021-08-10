package customPalindrome;

public class CustomPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String sentence) {
		boolean isPalindrome = true;

		// replace every char that is either no word char or not a number
		sentence = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int length = sentence.length();
		int iterationCount = length / 2;
		for (int a = 0, b = length - 1; a < iterationCount; a++, b--) {
			if (sentence.charAt(b) != sentence.charAt(a)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

}
