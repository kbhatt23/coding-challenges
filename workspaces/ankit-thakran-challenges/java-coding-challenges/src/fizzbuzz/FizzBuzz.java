package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
		List<String> items = new ArrayList<>(n); // size can be set fixed so that no need of grwoing array
		for (int number = 1; number <= n; number++) {
			boolean divisibleBy3 = ((number % 3) == 0);
			boolean divisibleBy5 = ((number % 5) == 0);
			if (divisibleBy3 && divisibleBy5) {
				items.add("FizzBuzz");
			} else if (divisibleBy3) {
				items.add("Fizz");
			} else if (divisibleBy5) {
				items.add("Buzz");
			} else {
				items.add(String.valueOf(number));
			}
		}

		return items;
	}
}
