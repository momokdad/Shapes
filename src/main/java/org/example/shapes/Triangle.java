package org.example.shapes;

import org.example.Shape;

import static org.example.utils.MathUtils.isPositive;

public class Triangle implements Shape {
	private double base;
	private double height;
	private double secondSide;
	private double thirdSide;


	@Override
	public double calculatePerimeter() {
		double perimeter = base + secondSide + thirdSide;
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = base * height / 2;
		return area;
	}

	public double calculatePerimeter(double base, double secondSide, double thirdSide) {
		if (isPositive(base) && isPositive(secondSide) && isPositive(thirdSide)) {
			double perimeter = base + secondSide + thirdSide;
			return perimeter;
		}
		return 0;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (isPositive(base)) {
			this.base = base;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (isPositive(height)) {
			this.height = height;
		}
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		if (isPositive(secondSide)) {
			this.secondSide = secondSide;
		}
	}

	public double getThirdSide() {
		return thirdSide;
	}

	public void setThirdSide(double thirdSide) {
		if (isPositive(thirdSide)) {
			this.thirdSide = thirdSide;
		}
	}

	@Override
	public String toString() {
		return "Triangle{" +
				"base=" + getBase() +
				", height=" + getHeight() +
				", secondSide=" + getSecondSide() +
				", thirdSide=" + getThirdSide() +
				'}';
	}
}
