package com.lec.ex1_store;
// 2ȣ��: ��ġ�-5,000 �δ��-5,000 �����-5,000 ���뱹-5,000  �����-����
public class Store2 extends HeadQuarterStore {
	public Store2(String str) {
		super(str);
	}
	@Override
	public void bude() {
		System.out.println("�δ�� - 5,000��");
	}
	@Override
	public void bibib() {
		System.out.println("����� - 5,000��");
	}
	@Override
	public void gonggibab() {
		System.out.println("����� - ����");
	}
	@Override
	public void kimchi() {
		System.out.println("����� - 5,000��");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 - 5,000��");
	}
}
