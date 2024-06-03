package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class FizzBuzzTestCase {

	@Test
	public void testFizzBuzzThat1Returbs1() {
		String result = Main.fizzbuzz(1);
		assertEquals("1", result);
	}

	@Test
	public void testFizzBuzzThat3ReturnsFizz() {
		String result = Main.fizzbuzz(3);
		assertEquals("fizz", result);
	}

	@Test
	public void testFizzBuzzThat2Returns2() {
		String result = Main.fizzbuzz(2);
		assertEquals("2", result);
	}

	@Test
	public void testFizzBuzzThat6ReturnsFizz() {
		String result = Main.fizzbuzz(6);
		assertEquals("fizz", result);
	}

	@Test
	public void testFizzBuzzThat10ReturnsBuzz() {
		String result = Main.fizzbuzz(10);
		assertEquals("buzz", result);
	}

	@Test
	public void testFizzBuzzThat15ReturnsFizzBuzz() {
		String result = Main.fizzbuzz(15);
		assertEquals("fizzbuzz", result);
	}
}
