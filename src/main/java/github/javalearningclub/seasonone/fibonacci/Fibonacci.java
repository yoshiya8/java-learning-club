package github.javalearningclub.seasonone.fibonacci;

/**
 * See https://github.com/yoshiya8/java-learning-club/wiki/Project-2:-Fibonacci-
 * Sequence
 */
public class Fibonacci {

	public void printFirstNFibonacciNumbers(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Fibonacci(" + i + ") = " + getNthFibonacciNumber(i));
		}
	}

	public int getNthFibonacciNumber(int n) {
		int answer = 1;
		if (n > 2) {
			answer = getNthFibonacciNumber(n - 2) + getNthFibonacciNumber(n - 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Fibonacci solver = new Fibonacci();
		solver.printFirstNFibonacciNumbers(10);
	}
}
