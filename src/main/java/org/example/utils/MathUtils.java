package org.example.utils;

public class MathUtils {
	public static boolean isPositive(double num) {
		if (num < 0) throw new IllegalArgumentException("Value of the input should be positive.");
		return true;
	}
}
