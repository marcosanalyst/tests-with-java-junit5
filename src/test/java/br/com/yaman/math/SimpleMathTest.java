package br.com.yaman.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.yaman.SimpleMath;


class SimpleMathTest {

	@Test
	void testSum() {

		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.sum(firstNumber, secondNumber);
	
		double expected = 8.2D;
		assertEquals(expected, actual, 
		() -> firstNumber + "+" + secondNumber + 
		"The testSum() did not produce" + expected + "result!");
	
		
	}
	
	@Test
	void testSubtraction() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 5D;
		double secondNumber = 5D;
		
		Double result = math.subtraction(firstNumber, secondNumber);
		
		double expected = 0;
		assertEquals(expected, result, () -> firstNumber + "-" + secondNumber + 
				"The testSubtraction() did not produce" + expected + "result!" );
	}
	
	@Test
	void testMultiplication() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 5D;
		double secondNumber = 5D;
		
		Double result = math.multiplication(firstNumber, secondNumber);
		
		double expected = 25;
		assertEquals(expected, result, () -> firstNumber + "*" + secondNumber + 
				"The testMultiplication() did not produce" + expected + "result!");
	}
	
	@Test
	void testDivision() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 5D;
		double secondNumber = 5D;
		
		Double result = math.division(firstNumber, secondNumber);
		
		double expected = 1;
		assertEquals(expected, result, 
				() -> firstNumber + "/" + secondNumber + 
				"The testDivision() did not produce" + expected + "result!");
	}
	
	@Test
	// Mean AVG
	void testMean() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 5D;
		double secondNumber = 5D;
		
		Double result = math.mean(firstNumber, secondNumber);
		
		double expected = 5;
		assertEquals(expected, result,  
				() -> firstNumber + "AVG" + secondNumber + 
				"The testMean() did not produce" + expected + "result!");
	}
	
	@Test
	void testSquareRoot() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 9D;
		
		
		Double result = math.squareRoot(firstNumber);
		
		double expected = 3;
		assertEquals(expected, result, () -> firstNumber + 
				"The testSquareRoot() did not produce" + expected + "result!");
	}
}
