package com.lec.ex02_store;
//1ȣ��: ��ġ�-4,500 �δ��-5,000 �����-6,000 ���뱹-���Ⱦ� �����-1,000��
public class Store1 implements HeadQuarterStore{
	private String str;
	public Store1(String str) {
		this.str = str;
	}
	@Override
	public void bude() {
		System.out.println("�δ�� - 5,000��");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 �� �Ⱦ�");
	}
	@Override
	public void kimchi() {
		System.out.println("��ġ� - 4,500��");
	}
	@Override
	public void bibib() {
		System.out.println("����� - 6,000��");
	}
	@Override
	public void gonggibab() {
		System.out.println("����� - 1,000��");
	}
	public String getStr() {
		return str;
	}
}













