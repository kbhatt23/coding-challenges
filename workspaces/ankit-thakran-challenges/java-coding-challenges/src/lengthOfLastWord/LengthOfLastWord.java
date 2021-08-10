package lengthOfLastWord;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = " abcd is awesome ";
		
		System.out.println(lengthOfLAstWordV1(str));
		System.out.println(lengthOfLAstWordV2(str));
		System.out.println(lengthOfLAstWordV3(str));
	}
	
	
	public static int lengthOfLAstWordV1(String sentence) {
		if(sentence == null)
			return -1;
		
		String[] words = sentence.split(" ");
		
		String lastWord = words[words.length-1];
		return lastWord.length();
	}
	
	public static int lengthOfLAstWordV2(String sentence) {
		if(sentence == null)
			return -1;
		sentence = sentence.trim();
		int length = 0 ;
		for(int j = sentence.length()-1 ; j >= 0 ; j--) {
			if(sentence.charAt(j) == ' ')
				break;
			else
				length++;
		}
		return length;
	}
	
	public static int lengthOfLAstWordV3(String sentence) {
		if(sentence == null)
			return -1;
		sentence = sentence.trim();
		int length =0;
		for(int i = 0 ; i < sentence.length() ; i++) {
			if(sentence.charAt(i) == ' ')
				length = 0; //resent
			else 
				length++;
		}
		
		return length;
	}
}
