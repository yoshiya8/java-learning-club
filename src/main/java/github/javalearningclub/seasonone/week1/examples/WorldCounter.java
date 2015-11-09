package github.javalearningclub.seasonone.week1.examples;

/**
 * This will print hello world messages to a specified number of worlds. It will
 * demonstrate three ways to do loops in Java.
 * 
 * @author yoshiya8
 */
public class WorldCounter {

	/**
	 * This is the number of worlds we will count to - we will set it in the
	 * "constructor" -
	 * 
	 * New concepts:
	 * <ul>
	 * <li>"private" - this variable can only be used inside this class.</li>
	 * <li>"final" - this variable is set only once (right here or in the
	 * constructor) and then never again.</li>
	 * <li>"int" - this variable is an integer a number without a decimal point
	 * - in Java an integer is a 32 bit signed value which means it must be
	 * something between {@value Integer#MIN_VALUE} and
	 * {@value Integer#MAX_VALUE}</li>
	 * </ul>
	 * 
	 */
	private int countTo = 0;

	/**
	 * The "Constructor" this will create a new object which is of the type
	 * WorldCounter Each such object you create can count up to a different
	 * number of worlds
	 * 
	 * @param countTo
	 *            The number of worlds you want to greet with the WorldCounter
	 *            object you create.
	 */
	public WorldCounter(int countTo) {
		this.countTo = countTo;
	}

	/** This will greet the worlds using a FOR loop */
	public void helloFor() {
		// The for loop is the most versatile of all loops there are three
		// sections (separated by ';'). The first initializes a loop variable,
		// the second is the condition, and the third increments the loop
		// variable. It is actually a little fancier than that, but let's not
		// worry about that right now.
		for (int i = 0; i < countTo; i++) {
			System.out.println("Hellow world #" + (i + 1));
		}
	}

	/** This will greet the worlds using a WHILE loop */
	public void helloWhile() {
		// The while loops is the simplest - it repeats the statements inside
		// the loop as along as the condition on the loop remains true.
		int i = 0;
		while (i < countTo) {
			i = i + 1;
			System.out.println("Hello world #" + i);
		}
	}

	/** This will greet the worlds using a DO-WHILE loop */
	public void helloDoWhile() {
		// The do-while loop is pretty simple - it repeats the statements inside
		// the loop and will exit once the condition on the loop is false. I
		// almost never use this type of loop - and it has an interesting quirk
		// - it always executes at least one time. If you set countTo to zero
		// you will see this will still print something out - so it basically is
		// broken for this task, but this behavior can be desirable in other
		// situations.
		int i = 0;
		do {
			i = i + 1;
			System.out.println("Hello world #" + i);
		} while (i < countTo);
	}

	/**
	 * An example program that creates a single WorldCounter that will greet 5
	 * worlds, then we use it 3 times - to greet the worlds using different
	 * types of loops.
	 * 
	 * @param args
	 *            Command line arguments (not used)
	 */
	public static void main(String[] args) {
		WorldCounter worldCounter = new WorldCounter(5);

		System.out.println();
		System.out.println("**************");
		System.out.println("** FOR LOOP **");
		System.out.println("**************");
		worldCounter.helloFor();

		System.out.println();
		System.out.println("****************");
		System.out.println("** WHILE LOOP **");
		System.out.println("****************");
		worldCounter.helloWhile();

		System.out.println();
		System.out.println("*******************");
		System.out.println("** DO WHILE LOOP **");
		System.out.println("*******************");
		worldCounter.helloDoWhile();
	}
}
