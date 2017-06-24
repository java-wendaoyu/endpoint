package com.endpoint.handler;

import java.util.List;

import com.endpoint.number.FizzBuzzWhizz;
/**
 * ��Ϸ��
 * @author �ĵ���
 * @since 2017/6/24
 */
public class Game {
	/**
	 * ������У��Ƚ��ȳ�
	 */
	private List<FizzBuzzWhizz> rules;

	public List<FizzBuzzWhizz> getRules() {
		return rules;
	}

	public void setRules(List<FizzBuzzWhizz> rules) {
		this.rules = rules;
	}
    /**
     * ��ӹ���
     * @param rule
     *        ����
     */
	public void addRule(FizzBuzzWhizz rule) {
		rules.add(rule);
	}
    /**
     * ɾ������
     * @param rule
     *         ����
     */
	public void removeRule(FizzBuzzWhizz rule) {
		rules.remove(rule);
	}
	/**
	 * ���ݹ���õ����
	 * @param number
	 *        ���������
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
