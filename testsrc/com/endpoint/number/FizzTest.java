package com.endpoint.number;

import org.junit.Assert;
import org.junit.Test;

public class FizzTest {

	@Test
	public void testGetResult_01() {
		Fizz fizz = new Fizz(4);
		int number = 6;
		String expected = "";
		String actual = fizz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testGetResult_02() {
		Fizz fizz = new Fizz(4);
		int number = 14;
		String expected = "Fizz";
		String actual = fizz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testGetResult_03() {
		Fizz fizz = new Fizz(4);
		int number = 8;
		String expected = "Fizz";
		String actual = fizz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
}
