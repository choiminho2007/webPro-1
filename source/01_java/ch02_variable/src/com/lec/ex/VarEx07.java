package com.lec.ex;

public class VarEx07 {
	public static void main(String[] args) {
		int i1 = 10;          // 4byte
		long l = 2200000000L; // 8byte
		double d1 = 10;  // �������� ����ȯ (����byte���� ū byte������)
		System.out.println("d1="+d1);
		double d2 = 10.19;
		int i2 = (int)d2; // �������� ����ȯ(������ �ս��� �߻��� ���� ����)
		System.out.println("i2="+i2);
	}
}