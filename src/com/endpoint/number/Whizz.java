package com.endpoint.number;
/**
 * 瞒足Whizz规则
 * @author 文道玉
 *
 */
public class Whizz extends FizzBuzzWhizz {

	public Whizz(int specialNumber) {
		super(specialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResult(int number) {
		// TODO Auto-generated method stub
		this.setFlag(true);
		if(number % this.getSpecialNumber() == 0){
			return "Whizz";
		}
		return "";
	}

}
