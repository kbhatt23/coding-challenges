package recursionexamples;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

	private static final Map<Integer, Long> CACHE = new HashMap<>();

	public static void main(String[] args) {
		// starts from 1
		int position = 50;
		
		System.out.println(fibonacciNumberCached(50));
//		long start = System.currentTimeMillis();
//		long fibonacci = fibonacciNumberCached(position);
//
//		System.out.println(fibonacci);
//
//		long end = System.currentTimeMillis();
//		System.out.println("time taken " + ((end - start) / 1000) + " seconds.");
//
//		start = System.currentTimeMillis();
//
//		fibonacci = fibonacciNumber(position);
//
//		System.out.println(fibonacci);
//
//		end = System.currentTimeMillis();
//		System.out.println("time taken " + ((end - start) / 1000) + " seconds.");

	}

	private static long fibonacciNumber(int position) {
		if (position <= 0) {
			return -1;
		}
		if (position == 1) {
			return 0;
		}
		if (position == 2 || position == 3) {
			return 1;
		}

		return fibonacciNumber(position - 1) + fibonacciNumber(position - 2);
	}
	
	private static long fibonacciNumberLoop(int position) {
		if (position <= 0) {
			return -1;
		}

		if (position == 1 || position == 2) {
			return position-1;
		}
		
		long previousToPrevious = 0;
		long previous = 1;
		long fibonacci = 0;
		for(int i = 2; i < position ; i++) {
			fibonacci = previous + previousToPrevious;
			long temp = previous;
			previous = fibonacci;
			previousToPrevious = temp;
		}
		
		return fibonacci;
	}

	private static long fibonacciNumberCached(int position) {
		if (position <= 0) {
			return -1;
		}
		if (position == 1) {
			return 0;
		}
		if (position == 2 || position == 3) {
			return 1;
		}
		if (CACHE.containsKey(position)) {
			System.out.println("cache hit for "+position);
			return CACHE.get(position);
		}

		long result = fibonacciNumberCached(position - 1) + fibonacciNumberCached(position - 2);
		CACHE.put(position, result);
		return result;
	}
}
