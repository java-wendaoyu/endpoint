package com.endpoint.handler;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.endpoint.number.Buzz;
import com.endpoint.number.Fizz;
import com.endpoint.number.FizzBuzzWhizz;
import com.endpoint.number.Whizz;

public class GameTest {
	private Game game;
    @Before
    public void setUp(){
    	game = new Game();
    }

	@Test
	public void testSetRules() {
		List<FizzBuzzWhizz> rules = new ArrayList<>();
		rules.add(new Fizz(3));
		rules.add(new Buzz(5));
		rules.add(new Whizz(7));
		int expected = rules.size();
		game.setRules(rules);
		int actual =game.getRules().size();
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testAddRule() {
		List<FizzBuzzWhizz> rules = new ArrayList<>();
		rules.add(new Fizz(3));
		rules.add(new Buzz(5));
		rules.add(new Whizz(7));
		int expected = rules.size();
		game.setRules(rules);
		game.addRule(new Fizz(3));
		expected += 1;
		int actual =game.getRules().size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testRemoveRule() {
		List<FizzBuzzWhizz> rules = new ArrayList<>();
		Fizz fizz =  new Fizz(3);
		Buzz buzz =  new Buzz(5);
		Whizz whizz = new Whizz(7);
		rules.add(fizz);
		rules.add(buzz);
		rules.add(whizz);
		int expected = rules.size();
		game.setRules(rules);
		game.removeRule(fizz);
		expected -= 1;
		int actual =game.getRules().size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetResult() {
		List<FizzBuzzWhizz> rules = new ArrayList<>();
		rules.add(new Fizz(3));
		rules.add(new Buzz(5));
		rules.add(new Whizz(7));
		String expected = "1";
		game.setRules(rules);
		String actual =game.getResult(1);
		Assert.assertEquals(expected, actual);
	}

}
