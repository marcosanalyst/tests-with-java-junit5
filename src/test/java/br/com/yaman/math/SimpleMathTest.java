package br.com.yaman.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.yaman.SimpleMath;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {
	
	//test[System Under Test]_[Condition or State Change]_[Expected Result]
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
	void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
		
		// AAA Arrange, Act Assert
		// Given Arrange
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		double expected = 8.2D;
		
		// When Act
		Double actual = math.sum(firstNumber, secondNumber);
		
		// Then Assert
				assertEquals(expected, actual, 
		() -> firstNumber + "+" + secondNumber + 
		"The testSum() did not produce" + expected + "result!");
	
		
	}
	
	@Test
	@DisplayName("Test 5 - 5 = 0")
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
	@DisplayName("Test 5 x 5 = 25")
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
	@DisplayName("Test 5 / 5 = 1")
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
	@DisplayName("Test 5 AVG 5 = 5")
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
	@DisplayName("Test RAIZ 9 = 3")
	void testSquareRoot() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 9D;
		
		
		Double result = math.squareRoot(firstNumber);
		
		double expected = 3;
		assertEquals(expected, result, () -> firstNumber + 
				"The testSquareRoot() did not produce" + expected + "result!");
	}
	
	@Disabled ("Código não implementado. Desabilitado.")
	@Test
	@DisplayName("Test X / 0 = FAIL")
	void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
		fail();
		
	}
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	@DisplayName("Display Name")
	@Test
	void testABCD_When_XYZ_Should() {
		//Given / Arrange
		//When /Act
		//Then /Assert
		// Window > Preferences > JAVA > Editor > Templates > New
	}

}
