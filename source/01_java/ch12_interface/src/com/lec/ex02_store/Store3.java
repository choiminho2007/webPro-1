package com.lec.ex02_store;
// implements�� ����, str�߰�, ������ ����, getter�߰�
//���ǰ��� ����3ȣ��: ��ġ�-6,000  �δ��-7,000  �����-7,000 ���뱹-6,000  �����-1,000��
public class Store3 implements HeadQuarterStore{
	private String str;
	public Store3(String str) {
		this.str = str;
	}
	@Override
	public void kimchi() {
		System.out.println("��ġ� - 6,000��");
	}
	@Override
	public void bude() {
		System.out.println("�δ�� - 7,000��");
	}
	@Override
	public void bibib() {
		System.out.println("����� - 7,000��");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 - 6,000��");
	}
	@Override
	public void gonggibab() {
		System.out.println("����� - 1,000��");
	}
	public String getStr() {
		return str;
	}
}
