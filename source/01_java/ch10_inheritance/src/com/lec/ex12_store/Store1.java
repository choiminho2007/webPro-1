package com.lec.ex12_store;
//���ð��� ����1ȣ��: �δ��-5,000  ���뱹-���Ⱦ�
public class Store1 extends HeadQuarterStore{
	public Store1(String str) {
		super(str);
	}
	@Override
	public void bude() {
		System.out.println("�δ�� - 5,000��");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 �� �Ⱦ�");
	}
}
