package com.lec.ex10_customer;
public class TestMain {
	public static void main(String[] args) {
		Customer customer = new Customer("È«", "010-9999-9999", "¼­¿ï", "1995-01-01");
		customer.buy(100000);
		customer.buy(900000);
		System.out.println(customer.infoString());
		Staff staff = new Staff("±è", "010-8888-8888", "2022-09-01", "°³¹ßÆÀ");
		Person person = new Person("ÀÌ", "010-7777-7777");
		Person[] personArr = {customer, staff, person};
		System.out.println("ÀÏ¹Ý for¹®");
		for(int i=0 ; i<personArr.length ; i++) {
			System.out.println(personArr[i].infoString());
		}
		System.out.println("È®Àå for¹®");
		for(Person p : personArr) {
			System.out.println(p.infoString());
		}
	}
}
