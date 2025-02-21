package br.com.yaman.math;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import br.com.yaman.SimpleMath;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS4 {
	
	SimpleMath math;
	
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @BeforeAll method! Executa ANTES de cada!");
		
	}
	
	@DisplayName("Test 5 / 5 = 1")
	@ParameterizedTest
	@MethodSource("testDivisionParameters")
	void testDivision(double firstNumber, double secondNumber, double expected ) {
		System.out.println("Teste de divisão!");

		System.out.println("Test" + firstNumber + " /" + secondNumber + " = "
				+ expected + "!");
		Double result = math.division(firstNumber, secondNumber);
		
		assertEquals(expected, result, 2D,
				() -> firstNumber + "/" + secondNumber + 
				"The testDivision() did not produce" + expected + "result!");
	}
	
	public static Stream<Arguments> testDivisionParameters() {
		return Stream.of(
				Arguments.of(6.2D, 2D, 3.1D),
				Arguments.of(71D, 14D, 5.07D),
				Arguments.of(18.3D, 3.1D, 5.90D));
	}
}
	
	
	
	
	
