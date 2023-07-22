package com.example.caculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CaculatorTest {
	private Caculator caculator = new Caculator();
	
	@Test
	public void testSum() {
		assertEquals(5, caculator.sum(2, 3));
	}
}
