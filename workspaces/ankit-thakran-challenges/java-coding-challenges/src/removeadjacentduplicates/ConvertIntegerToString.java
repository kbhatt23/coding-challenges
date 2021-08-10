package removeadjacentduplicates;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		int number = 0;

		String stringNumber = convertIntegerToString(number);
		System.out.println(String.format("string value for int: %d is %s", number,stringNumber));
	}

	private static String convertIntegerToString(int number) {
		if(number <= 0) {
			return "0";
		}

		return convertIntegerToStringRecursively(number).toString();
	}

	private static StringBuilder convertIntegerToStringRecursively(int number) {
		if (number <= 0) {
			return new StringBuilder();
		}
		
		int remainder = number %10;
		StringBuilder soFar = convertIntegerToStringRecursively(number/10);
		
		soFar.append(remainder);
		
		return soFar;
	}
}
