package github.javalearningclub.seasonone.fizzbuzz;

/**
 * See https://github.com/yoshiya8/java-learning-club/wiki/Project-1:-Fizz-Buzz
 */
public class FizzBuzz {
	private int playUpToValue = 100;
	public void playValue(int value) {
		// Print value, "fizz", "buzz", or "fizz-buzz"
		if ((value%3 == 0) && (value%5 == 0)) {
			System.out.println("Fizz Buzz");
		} else {
			if (value%3 == 0) {
				System.out.println("Fizz");
			} else {
				if (value%5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(value);
				}
			}
		}
	}
	public void playUpToValue(int topValue) {
		// Loop from 1 to topValue and call "playValue" for each value
		int i = 1;
		while (i <= topValue) {
			playValue(i);
			i = i+1;
		}
	}

	public static void main(String args[]) {
		FizzBuzz myFizzBuzz = new FizzBuzz();
		myFizzBuzz.playUpToValue(100);
	}

}
