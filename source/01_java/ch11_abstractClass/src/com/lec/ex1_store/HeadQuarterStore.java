package com.lec.ex1_store;
// HeadQuarterStore hstore = new HeadQuarterStore("����"); ��ü ���� �Ұ�
public abstract class HeadQuarterStore {
	private String str; // "����"
	public HeadQuarterStore(String str) {this.str = str;}
	// �޼ҵ� ������ ���� ���� �Ǿ� �ִ� �޼ҵ� : �߻� �޼ҵ� (��ӹ��� Ŭ�������� �������̵�)
	// Ŭ���� �� �߻� �޼ҵ尡 �ϳ� �̻��� �� : �߻�Ŭ����
	public abstract void kimchi();
	public abstract void bude();
	public abstract void bibib();
	public abstract void sunde();
	public abstract void gonggibab() ;
	public String getStr() {return str;}
	public void setStr(String str) {this.str = str;}
}
