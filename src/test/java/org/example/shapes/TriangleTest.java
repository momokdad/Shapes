package org.example.shapes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static testUtils.TestConstants.DELTA;

public class TriangleTest {
	double base = 5;
	double height = 4;
	double secondSide = 4;
	double thirdSide = 3;

	@Test
	public void calculateArea_WhenBaseIsFiveAndHeightIsFour_Returns10() {
		Triangle triangle = new Triangle();
		triangle.setBase(base);
		triangle.setHeight(height);
		double expectedArea = triangle.calculateArea();

		double actualArea = base * height / 2;

		assertEquals(expectedArea, actualArea, DELTA);
	}

	@Test
	public void calculatePerimeter_WhenBaseIsFiveAndSecondSideIsFourAndThirdSideIsThree_Returns12() {
		Triangle triangle = new Triangle();
		triangle.setBase(base);
		triangle.setSecondSide(secondSide);
		triangle.setThirdSide(thirdSide);
		double expectedPerimeter = triangle.calculatePerimeter();

		double actualPerimeter = base + secondSide + thirdSide;

		assertEquals(expectedPerimeter, actualPerimeter, DELTA);
	}

	@Test
	public void calculatePerimeterOverloaded_WhenBaseIsFiveAndSecondSideIsFourAndThirdSideIsThree_Returns12() {
		Triangle triangle = new Triangle();
		double expectedPerimeter = triangle.calculatePerimeter(base, secondSide, thirdSide);

		double actualPerimeter = base + secondSide + thirdSide;

		assertEquals(expectedPerimeter, actualPerimeter, DELTA);
	}
}
