package org.example.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static testUtils.TestConstants.DELTA;

public class SquareTest {
	double side = 5.0;

	@Test
	public void calculateArea_WhenSideIsFive_Returns25() {
		Square square = new Square();
		square.setSide(side);
		double expectedArea = side * side;

		double actualArea = square.calculateArea();

		assertEquals(expectedArea, actualArea, DELTA);

	}

	@Test
	public void calculatePerimeter_WhenSideIsFive_Returns20() {
		Square square = new Square();
		square.setSide(side);
		double expectedPerimeter = square.calculatePerimeter();

		double actualPerimeter = 4 * side;

		assertEquals(expectedPerimeter, actualPerimeter, DELTA);
	}
}
