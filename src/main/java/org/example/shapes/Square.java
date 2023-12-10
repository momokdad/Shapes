package org.example.shapes;

import org.example.Shape;

import static org.example.utils.MathUtils.isPositive;

public class Square implements Shape {
	private double side;

	@Override
	public double calculateArea() {
		double area = side * side;
		return area;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (isPositive(side)) {
			this.side = side;
		}
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 4 * side;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Square{" +
				"side=" + getSide() +
				'}';
	}
}

