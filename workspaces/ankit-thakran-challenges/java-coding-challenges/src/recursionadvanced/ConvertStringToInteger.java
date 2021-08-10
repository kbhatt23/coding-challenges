package recursionadvanced;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String str ="00010234";
		
		int resultUsingLoop = resultUsingLoop(str);
		System.out.println("resultUsingLoop "+resultUsingLoop);
		
		int resultUsingRecursion =resultUsingRecursion(str, 0, str.length()-1);
		
		System.out.println("resultUsingRecursion: "+resultUsingRecursion);
	}

	private static  int resultUsingLoop(String str) {
		int length = str.length();
		int integer = 0;
		for(int index =0, multipler =length-1  ; index < length ; index++,multipler--) {
			int number =str.charAt(index) - '0';
			integer += number * Math.pow(10, multipler);
		}
		return integer;
	}
	

	private static  int resultUsingRecursion(String str ,int startIndex , int multipler) {
		if(startIndex >= str.length()) {
			return 0;
		}
		
		int number = str.charAt(startIndex) - '0';
		int currentResult = number * (int)Math.pow(10, multipler);
		
		return currentResult + resultUsingRecursion(str, startIndex+1, multipler-1);
		
	}

}
