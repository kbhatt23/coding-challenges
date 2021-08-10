package recursionadvanced;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsequenceOfString {
	private static List<String> subsequences ;

	public static void main(String[] args) {
		subsequences = new ArrayList<>();
		String str = "abc";
		subsequences(str, "", 0);
		
		System.out.println("final "+subsequences);
	}
	
	
	private static void subsequences(String str , String output , int index){
		
		//like normal iteration
		if(index >= str.length()) {
			subsequences.add(output);
			return; 
		}
		
		//ignore it
		subsequences(str, output, index+1);
		
		subsequences(str, output + str.charAt(index), index+1);
	}
	
}
