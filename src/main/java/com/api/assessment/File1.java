package com.api.assessment;

public class File1 {

	/**
	 * Adds two integers. This method takes two integer values and returns their
	 * sum.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of a and b
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Multiplies two integers. This method takes two integer values and returns
	 * their product.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the product of a and b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Main method. Entry point of the program that demonstrates the use of add and
	 * multiply methods.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		SampleClass calculator = new SampleClass();
		int sum = calculator.add(5, 3);
		int product = calculator.multiply(4, 2);

		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
}
