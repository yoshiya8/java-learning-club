// This is a comment - the very first statement in your 'class' must be a definition of the package that it is a part of - this package name MUST match the directory path from the project root directory.
package github.javalearningclub.seasonone;

/**
 * Your first project - simply prints out "Hello world!",but you can learn quite
 * a bit about Java by doing this project.
 * 
 * The first thing you can learn is a comment - this isn't code, but it is a way
 * to write notes to yourself and other programmers - this is very important
 * 
 * This type of comment is made for a tool called Javadoc - which will
 * automatically generate HTML documentation for your code
 */
public class HelloWorld {
	/*
	 * Multi line comment: in Java, everything is a class. A class is a type of
	 * thing - like a calculator, puzzle solver, a piece of fruit - what it is
	 * doesn't really matter, but a class is a description of the properties and
	 * behaviors of some type of thing - you get to define it.
	 * 
	 * This program is not a good example of a class, but in Java, everything is
	 * a class, and in order to just print something out, you will need to make
	 * a class.
	 * 
	 * A class may be 'public' which means it may be used anywhere in the
	 * project (or even in other projects). If you do not make the class public,
	 * it will automatically be "package scope" which means you will only be
	 * able to use the class from inside it's package.
	 */

	/**
	 * This is the "main" function of the class - the "main" function lets you
	 * run the class like a program. The beginning of the main function always
	 * looks the same, that's how Java recognizes it.
	 * 
	 * @param args
	 *            This is the parameter with the arguments for the program - it
	 *            is an array of Strings. An array is like a list and a String
	 *            is just a type that contains text.
	 */
	public static void main(String[] args) {
		// Line comment: the next line prints out "Hello World!"
		System.out.println("Hello World!");
	}
}
