package recursionexamples;

public class CheckPalindromeRecursively {

	public static void main(String[] args) {
		String str= "aa";
		
		System.out.println(isPalindrome(str));
		
		System.out.println(isPalindrome(str, 0, str.length()-1));
	}
	
	private static boolean isPalindrome(String str) {
		if(str == null || str.length() == 0) {
			return true;
		}
		int iteration = str.length()/2;
		for(int i = 0 , j = str.length()-1; i <= iteration ; i ++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	//recursively
	private static boolean isPalindrome(String str , int start , int end) {
		if(str == null || str.length() == 0) {
			return true;
		}
		if(start > end) {
			return true;
		}
		
		if(str.charAt(start) == str.charAt(end)) {
			return isPalindrome(str, start+1, end-1);
		}else {
			return false;
		}
	}
}
