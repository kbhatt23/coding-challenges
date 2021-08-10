package recursionexamples;

import java.util.ArrayList;
import java.util.List;

public class FoundIndexStore {

	public static void main(String[] args) {
		int numToSearch = 5;
		int[] numbers = { 5, 5, 6, 5, 6, 7 };
		
		System.out.println(foundIndices(numbers, numToSearch, 0));
		System.out.println(foundIndicesForward(numbers, numToSearch, numbers.length-1));
		
		List<Integer> indices = new ArrayList<>();
		foundIndicesForwardPassed(numbers, numToSearch, indices, 0 );
		System.out.println(indices);
		
		List<Integer> arrayList = new ArrayList<>();
		
		foundIndicesForwardPassedReverse(numbers, numToSearch, arrayList, numbers.length-1);
		System.out.println(arrayList);
		
	}
	
	private static void foundIndicesForwardPassed(int[] numbers, int numToSearch, List<Integer> indices, int startindex) {

		if(startindex >= numbers.length) {
			return;
		}
		
		if(numbers[startindex] == numToSearch) {
			indices.add(startindex);
		}
		foundIndicesForwardPassed(numbers, numToSearch, indices, startindex+1);
	}
	
	private static void foundIndicesForwardPassedReverse(int[] numbers, int numToSearch, List<Integer> indices, int endIndex) {

		if(endIndex < 0) {
			return;
		}
		
		if(numbers[endIndex] == numToSearch) {
			indices.add(endIndex);
		}
		foundIndicesForwardPassedReverse(numbers, numToSearch, indices, endIndex - 1);
	}

	private static List<Integer> foundIndices(int[] numbers ,int numToSearch , int startIndex ) {
		
		if(startIndex >= numbers.length) {
			return new ArrayList<>();
		}
		
		List<Integer> soFarCount = foundIndices(numbers, numToSearch, startIndex+1);
		if(numbers[startIndex] == numToSearch)
			soFarCount.add(startIndex);
		
		return soFarCount;
	}
	
	private static List<Integer> foundIndicesForward(int[] numbers ,int numToSearch , int endIndex ) {
		
		if(endIndex < 0) {
			return new ArrayList<>();
		}
		
		List<Integer> soFarCount = foundIndicesForward(numbers, numToSearch, endIndex - 1);
		if(numbers[endIndex] == numToSearch)
			soFarCount.add(endIndex);
		
		return soFarCount;
	}
	
}
