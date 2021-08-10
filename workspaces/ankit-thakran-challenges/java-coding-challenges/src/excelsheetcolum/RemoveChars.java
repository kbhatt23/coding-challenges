package excelsheetcolum;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveChars {

	public static void main(String[] args) {
		char c = 'e';
		String str = "geksofgeeks";
		
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(ch != c)
				sb.append(ch);
		}
		
		System.out.println(sb.toString());
	}
}
