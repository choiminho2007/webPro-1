package com.lec.ex2_parking;
public class ParkingTestMain {
	public static void main(String[] args) {
		Parking car1 = new Parking("111��1111", 12);
		Parking car2 = new Parking("22��2222", 12);
		car1.out();	// ����ڿ��� outTime �ޱ�								
		car2.out(15); // outTime�� 15�� �ޱ�
	}
}
