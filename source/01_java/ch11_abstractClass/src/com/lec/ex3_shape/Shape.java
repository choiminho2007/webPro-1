package com.lec.ex3_shape;
// Shape�� ���� Rectanle(w,h), Traiangle(w,h), Circle(r)�� �� ������ �� 
public abstract class Shape {
	public void draw() {
		String className = this.getClass().getName(); // com.lec.ex3_shape.Circle
		System.out.println(className+" ������ �׷���");
	}
	public abstract double computeArea(); // �߻�޼ҵ�
}
