package com.endpoint.number;
/**
 * Buzz ����������򷵻�Buzz
 * @author �ĵ���
 * @since 2017/6/24
 */
public class Buzz extends FizzBuzzWhizz {
    
	public Buzz(int specialNumber) {
		super(specialNumber);
	}
    /**
     * @param number
     *        ���յ�����
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
