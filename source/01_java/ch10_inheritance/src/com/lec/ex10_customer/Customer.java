package com.lec.ex10_customer;
// name, tel, address, sum, point, date, vip
// Customer c = new Customer("홍", "010","설","1995-12-12");
public class Customer extends Person{
	private String address;
	private int    sum; // 구매누적금액
	private int    point; // 포인트(구매마다 5%적립)
	private String date;  // 기념일(Date타입될 예정)
	private boolean vip; // true면 vip, false면 일반
	public Customer(String name, String tel, String address, String date) {
		super(name, tel);
		this.address = address;
		this.date    = date;
		point = 1000; // 새 고객에게는 1000 포인트 자동 부여
//		sum = 0; // 새 고객의 구매누적금액 0
//		vip = false; // 새고객은 일반고객으로
		System.out.println(name+"님 감사감사. 포인트 1000점을 선물로");
	}

	
}
