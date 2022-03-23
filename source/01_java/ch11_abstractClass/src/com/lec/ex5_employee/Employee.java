package com.lec.ex5_employee;

public abstract class Employee {
	private String name;
	public Employee() {	}
	public Employee(String name) { this.name = name; }
	public abstract int computePay();
	public final int computeIncentive(){
		int pay = computePay();
		if (pay>2000000) {
			return (int)(pay*0.1);
		}
		return 0;
	}
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
}
