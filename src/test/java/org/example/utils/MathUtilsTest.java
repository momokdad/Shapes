package org.example.utils;

import org.junit.Test;

import static org.example.utils.MathUtils.isPositive;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class MathUtilsTest {

	@Test
	public void isPositive_WhenNumIsFive_ReturnsTrue() {
		double positiveNumber = 5.0;
		boolean positiveNumberChecker =  isPositive(positiveNumber);

		assertTrue(positiveNumberChecker);
	}
	
	@Test
	public void isPositive_WhenNumIsMinusFive_ThrowsIllegalArgumentException() {
		double negativeNumber = -5.0;
		assertThrows(IllegalArgumentException.class, ()->{
			 isPositive(negativeNumber);
		});
		
	}
}
