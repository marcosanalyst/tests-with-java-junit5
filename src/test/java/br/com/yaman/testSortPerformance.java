package br.com.yaman;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class testSortPerformance {

	@Test
	//@Timeout(1)
	@Timeout(value = 15, unit = TimeUnit.SECONDS)
	void testSortPerformance() {
		
		int[] numbers = {25,8,21,32,3};
		for (int i = 0; i < 1000; i ++) {
		
		numbers[0] = i;
		Arrays.sort(numbers);
		}

	}

}
