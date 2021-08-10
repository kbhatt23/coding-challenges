package recursionadvanced;

public class PrintAllSubsequences {

	public static void main(String[] args) {
		String str = "abc";
		printAllSubsequences("", 0, str);
	}
	
	//same like choice problem
	//for each character wither we take it or ignore it
	private static void printAllSubsequences( String output , int index, String str) {
		//all items are traversed 
		//all chars of string are already traversed
		if(index >= str.length()) {
			System.out.println("found subsequence "+output);
			return;
		}
		
		//exclude it
		printAllSubsequences(output, index+1, str);
		
		//take it
		printAllSubsequences(output + str.charAt(index), index+1, str);
		
	}
}
