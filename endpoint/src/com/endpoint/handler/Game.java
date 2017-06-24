package com.endpoint.handler;

import java.util.List;

import com.endpoint.number.FizzBuzzWhizz;
/**
 * 游戏类
 * @author 文道玉
 * @since 2017/6/24
 */
public class Game {
	/**
	 * 规则队列，先进先出
	 */
	private List<FizzBuzzWhizz> rules;

	public List<FizzBuzzWhizz> getRules() {
		return rules;
	}

	public void setRules(List<FizzBuzzWhizz> rules) {
		this.rules = rules;
	}
    /**
     * 添加规则
     * @param rule
     *        规则
     */
	public void addRule(FizzBuzzWhizz rule) {
		rules.add(rule);
	}
    /**
     * 删除规则
     * @param rule
     *         规则
     */
	public void removeRule(FizzBuzzWhizz rule) {
		rules.remove(rule);
	}
	/**
	 * 根据规则得到结果
	 * @param number
	 *        输入的数字
	 * @return 
	 *     
	 */
	public String getResult(int number){
		String result = "";
		for (FizzBuzzWhizz fizzBuzzWhizz : rules) {
			result += fizzBuzzWhizz.getResult(number);
			if(!fizzBuzzWhizz.isFlag()){
				break;
			}
		}
		if(result == null || result.trim().isEmpty()){
			return String.valueOf(number);
		}else{
			return result;
		}
	}
}
