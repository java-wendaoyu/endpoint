package com.endpoint.number;
/**
 * 游戏规则抽象类
 * @author 文道玉
 *
 */
public abstract class FizzBuzzWhizz {
	/**
	 * 该规则的特殊数字
	 */
	private int specialNumber;
	/**
	 * 判断经过这次处理后是否还需要再次处理，true 需要
	 *                           false 不需要
	 */
	private boolean flag;
	public FizzBuzzWhizz(int specialNumber) {
		this.specialNumber = specialNumber;
	}
	public int getSpecialNumber() {
		return specialNumber;
	}
     
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public abstract String getResult(int number);
	
}
