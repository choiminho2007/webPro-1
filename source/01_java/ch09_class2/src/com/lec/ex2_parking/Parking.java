package com.lec.ex2_parking;
import java.util.Scanner;

import com.lec.cons.Constant;
public class Parking {
	private String no;
	private int inTime;
	private int outTime;
	private int fee;
//	private final int HOURLYPARKINGRATE=2000;
	public Parking() {}
	public Parking(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		inPrint();
	}
	private void inPrint() {
		System.out.println("\""+no+"\"�� �������");
		System.out.println("�����ð� : "+ inTime +"��");
		System.out.println("***********************");
	}//car1.out(15)
	public void out(int outTime) {
		this.outTime = outTime;
		fee = (outTime-inTime) * Constant.HOURLYPARKINGRATE;
		System.out.println("\""+no+"\"�� �ȳ��� ������");
		System.out.println("�����ð� : "+ inTime +"��");
		System.out.println("�����ð� : "+ outTime +"��");
		System.out.println("������� : "+fee+"��");
		System.out.println("***********************");
	}
	public void out() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(inTime+"�ÿ� �����̴µ� ��ÿ� �����Ͻó���? ");
		outTime = scanner.nextInt();
		out(outTime);
		scanner.close();
	}
}














