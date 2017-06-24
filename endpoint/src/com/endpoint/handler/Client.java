package com.endpoint.handler;

import java.util.ArrayList;
import java.util.Scanner;

import com.endpoint.number.Buzz;
import com.endpoint.number.Fizz;
import com.endpoint.number.FizzBuzzWhizz;
import com.endpoint.number.Whizz;
/**
 * 客户端类
 * @author 文道玉
 * @since 2017/6/24
 */
public class Client {
	public static void main(String[] args) {
		Game game = new Game();
		game.setRules(new ArrayList<FizzBuzzWhizz>());
		Scanner in = new Scanner(System.in);
		String rule = in.nextLine();
		String[] rules = rule.split(",");
		game.addRule(new Fizz(Integer.valueOf(rules[0])));
		game.addRule(new Buzz(Integer.valueOf(rules[1])));
		game.addRule(new Whizz(Integer.valueOf(rules[2])));
		
		for(int i=1; i<=100; i++){
			System.out.println(game.getResult(i));
		}
		in.close();
	}
}
