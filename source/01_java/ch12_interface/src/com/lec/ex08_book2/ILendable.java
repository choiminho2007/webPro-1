package com.lec.ex08_book2;
// Book �۾���
public interface ILendable {
	public byte STATE_BORROWED = 1; // "���� ��"�� �ǹ�
	public byte STATE_NORMAL   = 0; // "���Ⱑ��"�� �ǹ�
	public void checkOut(String borrower, String checkoutDate); // ����� �����ΰ� ������ �̿�
	public void checkIn(); // �ݳ�
	public void printState(); // ���������� ���� ���� ���
}
