package com.lec.condition;

public class Ex05_evenOdd {
	public static void main(String[] args) {
		int num = -3;
		// if
		if(num%2 == 0) {
			System.out.print("¦��");
		}else {
			System.out.print("Ȧ��");
		}
		// switch
		switch(num%2) {
			case 0 : System.out.print("¦��"); break;
			default : System.out.print("Ȧ��"); break;
		}
		// ���׿�����
		System.out.print(num%2==0 ? "¦��":"Ȧ��");
	}
}










