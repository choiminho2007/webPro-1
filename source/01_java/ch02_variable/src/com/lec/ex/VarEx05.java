package com.lec.ex;
public class VarEx05 {
	public static void main(String[] args) {
		float f1;
		f1 = 10.1F;
		System.out.println("f1="+f1);
		f1 = 10.0000017f;
		double d = 10.0000017;
		System.out.println("f1="+f1);
		System.out.println("d="+d);
		f1 = 10.1f;
		d = 10.1;
		if (f1==d)
			System.out.println("�� ������ ����");
		else
			System.out.println("�κ����� �ٸ���");
	}
}







