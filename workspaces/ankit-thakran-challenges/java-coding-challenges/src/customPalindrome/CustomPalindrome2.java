package customPalindrome;

public class CustomPalindrome2 {
	public static void main(String[] args) {
		String str = "abcddba";
		System.out.println(validPalindrome(str));
	}

	public static boolean validPalindrome(String str) {
		if(isPalindrome(str))
			return true;
		
		for(int i = 0 ; i < str.length() ; i ++) {
			String strCut = str.substring(0, i) + str.substring(i+1);
			if(isPalindrome(strCut)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isPalindrome(String str) {
		int length = str.length();
		int iterationCount = length / 2;
		for (int a = 0, b = length - 1; a < iterationCount; a++, b--) {
			if (str.charAt(b) != str.charAt(a)) {
				return false;
			}
		}
		return true;
	}
}
