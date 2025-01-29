package br.com.yaman.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.yaman.SimpleMath;



class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		Double actual = math.sum(6.2D, 3.8D);
	
		double expected = 10D;
		assertEquals(expected, actual);
		
		
		
	}

}
