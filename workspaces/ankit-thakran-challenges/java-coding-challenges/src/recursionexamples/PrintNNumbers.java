package recursionexamples;

import java.util.stream.IntStream;

public class PrintNNumbers {

	public static void main(String[] args) {
		// print 1- number
		int number = 9;

		printUsingLoop(number);
		System.out.println("=====================");
		printUsingRecursion(number);
	}

	private static void printUsingLoop(int number) {
		IntStream.rangeClosed(1, number).forEach(n -> System.out.println("printUsingLoop: number " + n));
	}

	private static void printUsingRecursion(int number) {
		printRecursion(number, 1);
	}

	private static void printRecursion(int number, int current) {
		if (current > number) {
			return;
			}

		System.out.println("printUsingRecursion: number " + current);
		printRecursion(number,++current);
	}
}
