package com.lec.ex10_customer;
// name, tel, address, sum, point, date, vip
// Customer c = new Customer("ȫ", "010","��","1995-12-12");
public class Customer extends Person{
	private String address;
	private int    sum; // ���Ŵ����ݾ�
	private int    point; // ����Ʈ(���Ÿ��� 5%����)
	private String date;  // �����(DateŸ�Ե� ����)
	private boolean vip; // true�� vip, false�� �Ϲ�
	public Customer(String name, String tel, String address, String date) {
		super(name, tel);
		this.address = address;
		this.date    = date;
		point = 1000; // �� �����Դ� 1000 ����Ʈ �ڵ� �ο�
//		sum = 0; // �� ���� ���Ŵ����ݾ� 0
//		vip = false; // ������ �Ϲݰ�����
		System.out.println(name+"�� ���簨��. ����Ʈ 1000���� ������");
	}

	
}
