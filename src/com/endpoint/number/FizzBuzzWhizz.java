package com.endpoint.number;
/**
 * ��Ϸ���������
 * @author �ĵ���
 *
 */
public abstract class FizzBuzzWhizz {
	/**
	 * �ù������������
	 */
	private int specialNumber;
	/**
	 * �жϾ�����δ�����Ƿ���Ҫ�ٴδ���true ��Ҫ
	 *                           false ����Ҫ
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
