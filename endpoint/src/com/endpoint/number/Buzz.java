package com.endpoint.number;
/**
 * Buzz 瞒足这个规则返回Buzz
 * @author 文道玉
 * @since 2017/6/24
 */
public class Buzz extends FizzBuzzWhizz {
    
	public Buzz(int specialNumber) {
		super(specialNumber);
	}
    /**
     * @param number
     *        接收的数字
     */
	@Override
	public String getResult(int number) {
		// TODO Auto-generated method stub
		this.setFlag(true);
		if(number % this.getSpecialNumber() == 0){
			return "Buzz";
		}
		return "";
	}

}
