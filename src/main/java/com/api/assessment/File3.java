package com.api.assessment;

public class File3 {

	/**
	 * Calculates the area of a circle. This method computes the area of a circle
	 * based on the radius provided.
	 *
	 * @param radius the radius of the circle
	 * @return the area of the circle
	 */
	public static double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

	/**
	 * Calculates the perimeter of a circle. This method calculates the perimeter
	 * (circumference) of a circle given the radius.
	 *
	 * @param radius the radius of the circle
	 * @return the perimeter of the circle
	 */
	public static double circlePerimeter(double radius) {
		return 2 * Math.PI * radius;
	}

	/**
	 * Main method. Demonstrates the calculation of area and perimeter of a circle
	 * with a given radius.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		double radius = 7.0;
		double area = circleArea(radius);
		double perimeter = circlePerimeter(radius);

		System.out.println("Area of the circle: " + area);
		System.out.println("Perimeter of the circle: " + perimeter);
	}
}
