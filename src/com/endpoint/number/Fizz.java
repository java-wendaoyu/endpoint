package com.endpoint.number;
/**
 * 瞒住Fizz规则返回结果Fizz
 * @author 文道玉
 *
 */
public class Fizz extends FizzBuzzWhizz {

	public Fizz(int specialNumber) {
		super(specialNumber);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param number
	 */
	@Override
	public String getResult(int number) {
		// TODO Auto-generated method stub
		if (String.valueOf(number).indexOf(this.getSpecialNumber() + 48) != -1) {
			this.setFlag(false);
			return "Fizz";
		} else {
			this.setFlag(true);
			if (number % this.getSpecialNumber() == 0) {
				return "Fizz";
			}
		}
		return "";
	}

}
