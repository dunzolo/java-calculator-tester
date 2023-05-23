package org.lesson.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator c;
	
	@BeforeAll
	public static void initCalculator() {
		final float num1 = 20;
		final float num2 = 0;
		
		c = new Calculator(num1, num2);
	}
	
	@Test
	public void getAddTest() {
		final float attRes = c.getNum1() + c.getNum2();
		final float res = c.add(20, 0);
		assertEquals(attRes, res, "Addizione tra float");
	}
	
	@Test
	public void getSubstractTest() {
		final float attRes = c.getNum1() - c.getNum2();
		final float res = c.subtract(20, 0);
		assertEquals(attRes, res, "Sottrazione tra float");
	}
	
	@Test
	public void getMultiplyTest() {
		final float attRes = c.getNum1() * c.getNum2();
		final float res = c.multiply(20, 0);
		assertEquals(attRes, res, "Moltiplicazione tra float");
	}
	
	@Test
	public void getDivideTest() throws Exception{
		assumeTrue(c.getNum2() != 0);
		final float attRes = c.getNum1() / c.getNum2();
		final float res = c.divide(20, 10);
		assertEquals(attRes, res, "Divisione tra float");
	}
	
	@Test
	public void getDivideTestExc() {
		assumeTrue(c.getNum2() == 0);
		assertThrows(Exception.class,
				() -> c.divide(20, 0),
				"Deve sollevare eccezione");
	}
}
