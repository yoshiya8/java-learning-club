package github.javalearningclub.seasonone.fibonacci;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * See https://github.com/yoshiya8/java-learning-club/wiki/Project-2:-Fibonacci-
 * Sequence
 */
public class Fibonacci {

	private Map<Integer, Long> cache = new HashMap<>();

	public void printFirstNFibonacciNumbers(long n) {
		// loop 1-n
		// calculate next fib #
		// print it out
		long last = 0;
		long lastLast = 0;
		long current = 1;
		System.out.println(current);
		for (long timeThrough = 0; timeThrough < n; timeThrough++) {
			lastLast = last;
			last = current;
			current = lastLast + last;
			System.out.println(current);
		}

	}

	public long getNthFibonacciNumber(int n) {
		Long f = cache.get(n);
		if (f != null) {
			return f;
		}
		if (n <= 2) {
			f = 1L;
		} else {
			f = getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
		}
		cache.put(n, f);
		return f;
	}

	public static void main(String[] args) {
		Fibonacci myFibonacci = new Fibonacci();
		System.out.println(myFibonacci.getNthFibonacciNumber(50));
	}
}
