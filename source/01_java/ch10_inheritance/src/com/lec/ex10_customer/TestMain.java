package com.lec.ex10_customer;
public class TestMain {
	public static void main(String[] args) {
		Customer customer = new Customer("ȫ", "010-9999-9999", "����", "1995-01-01");
		customer.buy(100000);
		customer.buy(900000);
		System.out.println(customer.infoString());
		Staff staff = new Staff("��", "010-8888-8888", "2022-09-01", "������");
		Person person = new Person("��", "010-7777-7777");
		Person[] personArr = {customer, staff, person};
		System.out.println("�Ϲ� for��");
		for(int i=0 ; i<personArr.length ; i++) {
			System.out.println(personArr[i].infoString());
		}
		System.out.println("Ȯ�� for��");
		for(Person p : personArr) {
			System.out.println(p.infoString());
		}
	}
}
