package org.example.shapes;

import org.example.Shape;

import static org.example.utils.MathUtils.isPositive;

public class Circle implements Shape {
	final double PI = 3.14;
	private double rad;

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		if (isPositive(rad)) this.rad = rad;
	}

	@Override
	public double calculateArea() {
		double area = PI * rad * rad;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * PI * rad;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle{" +
				"PI=" + PI +
				", rad=" + getRad() +
				'}';
	}
}
