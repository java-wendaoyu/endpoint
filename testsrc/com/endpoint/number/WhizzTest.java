package com.endpoint.number;

import org.junit.Assert;
import org.junit.Test;

public class WhizzTest {

	@Test
	public void testGetResult_01() {
		Whizz whizz = new Whizz(4);
		int number = 6;
		String expected = "";
		String actual = whizz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testGetResult_02() {
		Whizz whizz = new Whizz(4);
		int number = 8;
		String expected = "Whizz";
		String actual = whizz.getResult(number);
		Assert.assertEquals(expected, actual);
	}
	
	

}
