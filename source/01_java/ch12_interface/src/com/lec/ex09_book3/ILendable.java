package com.lec.ex09_book3;

public interface ILendable {
	public static final byte STATE_BORROWED =1;
	public final static byte STATE_NORMAL = 0;
	public void checkOut(String borrwer, String checkOutDate); // �����ϴ� �޼ҵ�
	public void checkIn();  // �ݳ��ϴ� �޼ҵ�
	public void printState(); // ������ ID�� ������ ���� ���� ���
}
