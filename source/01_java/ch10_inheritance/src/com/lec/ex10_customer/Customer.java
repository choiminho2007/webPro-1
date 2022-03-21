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
		super(name, tel); // ù��° ���ο� �;� ��
		this.address = address;
		this.date    = date;
		point = 1000; // �� �����Դ� 1000 ����Ʈ �ڵ� �ο�
//		sum = 0; // �� ���� ���Ŵ����ݾ� 0
//		vip = false; // ������ �Ϲݰ�����
		System.out.println(name+"�� ���簨��. ����Ʈ 1000���� ������");
	}
	public void buy(int price) {// c.buy(10000)
		sum += price;
		int tempPoint = (int)(price*0.05);
		point += tempPoint;
		System.out.println(getName()+"�� ����. �̹� ���ŷ� ����Ʈ "+tempPoint+"�� �߰��Ǿ� �� ����Ʈ :"+point);
		if (sum>=1000000 && vip==false) {
			vip = true; // ���Ŵ����ݾ��� 100���� �̻�� vip������
			System.out.println(getName() + "�� VIP������ ���׷��̵� �Ǽ̽��ϴ�");			
		}// if
	}// buy
	// sysout(c.infoString())   / super.infoString() "[�̸�]ȫ [��ȭ]010-9999-999"
	// @ : ������̼�
	@Override
	public String infoString() {
		return super.infoString() + " [�ּ�]"+address +" [����Ʈ]"+point +" [�����ݾ�]"+sum;
	}
}













