package br.com.yaman.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.yaman.SimpleMath;



class SimpleMathTest {

	@Test
	void testSum() {
		float x = 7f;
		double y = 6.2d;
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.sum(firstNumber, secondNumber);
	
		double expected = 8.2D;
		assertEquals(expected, actual, 
		() -> firstNumber + "+" + secondNumber + 
		"The testSum() did not produce" + expected + "result!");

		
		
		
	}

}
