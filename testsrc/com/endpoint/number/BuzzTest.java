package com.endpoint.number;

import org.junit.Assert;
import org.junit.Test;

public class BuzzTest {

	@Test
	public void testGetResult_01() {
		Buzz buzz = new Buzz(4);
		int number = 6;
		String expected = "";
		String actual = buzz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testGetResult_02() {
		Buzz buzz = new Buzz(4);
		int number = 8;
		String expected = "Buzz";
		String actual = buzz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
}
