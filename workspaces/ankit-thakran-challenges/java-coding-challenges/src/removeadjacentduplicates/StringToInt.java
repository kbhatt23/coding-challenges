package removeadjacentduplicates;

public class StringToInt {

	public static void main(String[] args) {
		String str = "11233434";
		
		int convertToInt = convertToInt(str);
		System.out.println(convertToInt);
		
		
	}

	private static int convertToInt(String str) {
		int result = 0;
		for(int i = 0 , k =str.length()-1; i < str.length() ; i ++, k--) {
			int multiplier =(int) Math.pow(10, k);
			int c = str.charAt(i) - '0';
			result += c *multiplier;
		}
		
		return result;
	}
}
