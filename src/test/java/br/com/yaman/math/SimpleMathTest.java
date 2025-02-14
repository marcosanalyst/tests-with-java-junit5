package br.com.yaman.math;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.yaman.SimpleMath;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {
	
	SimpleMath math;
	
	@BeforeAll
	static void setup() {
		System.out.println("Running @BeforeAll method! Executa ANTES de todos!");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("Running @AfterAll method! Executa DEPOIS de todos!");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @BeforeAll method! Executa ANTES de cada!");
		
	}
	
	@AfterEach
	void afterEachMethod() {
		System.out.println("Running @AfterAll method! Executa DEPOIS de cada!");}
		
		
	//test[System Under Test]_[Condition or State Change]_[Expected Result]
	
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
	void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
		
		System.out.println("Teste de soma!");
		// AAA Arrange, Act Assert
		// Given Arrange
		
		
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
		System.out.println("Teste de subtração!");
		
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
		System.out.println("Teste de multiplicação!");
		
		double firstNumber = 5D;
		double secondNumber = 5D;
		
		Double result = math.multiplication(firstNumber, secondNumber);
		
		double expected = 25D;
		assertEquals(expected, result, () -> firstNumber + "*" + secondNumber + 
				"The testMultiplication() did not produce" + expected + "result!");
	}
	
	@Test
	@DisplayName("Test 5 / 5 = 1")
	void testDivision() {
		System.out.println("Teste de divisão!");
		
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
		System.out.println("Teste de média!");
		
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
		
		System.out.println("Teste de raiz quadrada!");
		double firstNumber = 9D;
				
		Double result = math.squareRoot(firstNumber);
		
		double expected = 3;
		assertEquals(expected, result, () -> firstNumber + 
				"The testSquareRoot() did not produce" + expected + "result!");
	}
	
	@Test
	@DisplayName("Test X / 0 = FAIL")
	void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
		
		System.out.println("Teste divisão por zero!");
		//given
		double firstNumber = 6.2;
		double secondNumber = 0D;
		
		var expectedMessage = "Impossível dividir por zero!";
		
		//when & then
		ArithmeticException actual = assertThrows(ArithmeticException.class, () -> { 
			//when & then
			math.division(firstNumber, secondNumber);
			}, () -> "Division by zero should thrrow an ArithmeticException" );
		
		assertEquals(expectedMessage, actual.getMessage(),
				() -> "Unexpected excepction message");
		
	}
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	@DisplayName("Display Name")
	@Test
	void testABCD_When_XYZ_Should() {
		
		System.out.println("Teste de BDD!");
		//Given / Arrange
		//When /Act
		//Then /Assert
		// Window > Preferences > JAVA > Editor > Templates > New
	}

}
