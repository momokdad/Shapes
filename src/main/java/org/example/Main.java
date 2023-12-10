package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Square;
import org.example.shapes.Triangle;

public class Main {
	public static void calcAreaAndPerimeter(Shape shape) {
		System.out.println(shape
				+ "\n" + "Area is: " + shape.calculateArea()
				+ "\n" + "Perimeter is: " + shape.calculatePerimeter()
				+ "\n" + "---------------------------");
	}

	public static void main(String[] args) {
		// Circle:
		Circle circle = new Circle();
		circle.setRad(22);
		calcAreaAndPerimeter(circle);

		// Square:
		Square square = new Square();
		square.setSide(12);
		calcAreaAndPerimeter(square);

		// Triangle:
		Triangle triangle = new Triangle();
		triangle.setHeight(10);
		triangle.setBase(10);
		double triangleArea = triangle.calculateArea();

		triangle.setSecondSide(13);
		triangle.setThirdSide(11);
		double trianglePerimeter = triangle.calculatePerimeter();

		System.out.println(triangle
				+ "\n" + "Area is: " + triangleArea
				+ "\n" + "Perimeter is: " + trianglePerimeter
				+ "\n" + "---------------------------");

		// Setting to minus value validation:
		try {
			triangle.setHeight(-11);
		} catch (IllegalArgumentException err) {
			System.out.println(err);
		}
	}
}