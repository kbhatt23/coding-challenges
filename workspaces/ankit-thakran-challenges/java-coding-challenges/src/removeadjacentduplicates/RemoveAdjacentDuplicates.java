package removeadjacentduplicates;

import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String str = "aababaab";
		String solveUsingSet = solveUsingSet(str);
		
		String solveUsingStack = solveUsingStack(str);
		
		System.out.println("solveUsingSet found is "+solveUsingSet+".");
		
		System.out.println("solveUsingStack found is "+solveUsingStack+".");
		
		System.out.println("solveUsingStackPart2: "+solveUsingStackPart2(str, 3));
	}

	private static String solveUsingStack(String str) {
		
		//at max all the items can be unique so no need of growing the internal array
		Deque<Character> charachters = new LinkedList<>();
		
		for (char character : str.toCharArray()) {
			if(charachters.isEmpty() ||  character != charachters.peek())
				charachters.push(character);
			else
				charachters.pop();
		}
		
		StringBuilder sb = new StringBuilder(charachters.size());
		while(!charachters.isEmpty()) {
			sb.append(charachters.pop());
		}
		return sb.reverse().toString();
	}
	
	private static String solveUsingStackPart2(String str , int duplicateCount) {
		
		//at max all the items can be unique so no need of growing the internal array
		Deque<Character> charachters = new LinkedList<>();
		int tempCount = 0;
		
		for (char character : str.toCharArray()) {
			if(charachters.isEmpty() ||  character != charachters.peek()) {
				tempCount++;
				charachters.push(character);
				}
			else if(duplicateCount == tempCount) {
				tempCount++;
				charachters.push(character);
			}
			else 
				charachters.pop();
		}
		
		StringBuilder sb = new StringBuilder(charachters.size());
		while(!charachters.isEmpty()) {
			sb.append(charachters.pop());
		}
		return sb.reverse().toString();
	}
	
	private static String solveUsingSet(String str) {
		
		//at max all the items can be unique so no need of growing the internal array
		Set<Character> charachters = new LinkedHashSet<>(str.length());
		
		for (char character : str.toCharArray()) {
			if(!charachters.contains(character))
				charachters.add(character);
			else
				charachters.remove(character);
		}
		
		StringBuilder sb = new StringBuilder(charachters.size());
		for(char character: charachters) {
			sb.append(character);
		}
		return sb.toString();
	}
}
