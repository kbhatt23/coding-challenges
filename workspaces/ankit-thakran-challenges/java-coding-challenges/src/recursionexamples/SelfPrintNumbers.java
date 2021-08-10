package recursionexamples;

public class SelfPrintNumbers {

	public static void main(String[] args) {
		int number = 11;
		
		printNumbers(number,false);
	}

	private static void printNumbers(int number, boolean reverse) {
		if(reverse) {
			printReverse(number);
		}else {
			//printForwardBad(number,1);
			printForwardGood(number);
		}
	}

	private static void printForwardGood(int number) {
		if(number<=0) {
			return;
		}
		//keep on delaying items until last item is recieved
		printForwardGood(number-1);
		System.out.println("found item "+number);
		
	}

	private static void printReverse(int number) {
		if(number <= 0)
			return;
		System.out.println("found item "+number);
		printReverse(number-1);
	}

	private static void printForwardBad(int number, int current) {
		if(current > number)
			return;
		
		System.out.println("found item "+current);
		printForwardBad(number, current+1);
	}
}
