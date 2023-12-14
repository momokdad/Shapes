package org.example.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static testUtils.TestConstants.DELTA;

public class CircleTest {
	double radius = 5.0;

	@Test
	public void calculateArea_WhenRadiusIsFive_Returns78_54() {
		Circle circle = new Circle();
		circle.setRad(radius);
		double expectedArea = circle.PI * radius * radius;

		double actualArea = circle.calculateArea();

		assertEquals(expectedArea, actualArea, DELTA);
	}

	@Test
	public void calculatePerimeter_WhenRadiusIsFive_Returns31_42() {
		Circle circle = new Circle();
		circle.setRad(radius);
		double expectedPerimeter = 2 * circle.PI * radius;

		double actualPerimeter = circle.calculatePerimeter();

		assertEquals(expectedPerimeter, actualPerimeter, DELTA);
	}
}
