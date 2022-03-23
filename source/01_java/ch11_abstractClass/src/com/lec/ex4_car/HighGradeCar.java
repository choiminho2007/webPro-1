package com.lec.ex4_car;

public class HighGradeCar extends Car {
	private int tax;
	public HighGradeCar(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		tax = 150000;
	}
	@Override
	public void getSpec() {
		if(getDisplacement() > 1800) {
			tax += (getDisplacement()-1800) * 300;
		}
		System.out.println("��   �� : "+getColor());
		System.out.println("Ÿ�̾� : "+getTire());
		System.out.println("��ⷮ : "+getDisplacement());
		System.out.println("��  �� : "+getHandle());
		System.out.println("��  �� : "+tax);
		System.out.println("--------------------");
	}
}