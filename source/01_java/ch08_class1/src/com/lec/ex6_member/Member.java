package com.lec.ex6_member;
public class Member {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private String birth;
	private char   gender;
	public Member() { }
	public Member(String id, String pw, String name, String email, String address, String birth, char gender) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.gender = gender;
	}
	public String infoString() {
//		return String.format("���̵� = %s\n�̸� = %s\n�̸��� = %s\n"+
//							 "�ּ� = %s\n���� = %s\n���� = %c\n", 
//							 id, name, email, address, birth, gender);
		String result = "���̵� = "+ id +"\n";
		result += "�̸� = " + name + "\n";
		result += "�̸��� = " + email + "\n";
		result += "�ּ� = " + address + "\n";
		result += "���� = " + birth + "\n";
		result += "���� = " + gender + "\n";
		return result;
	}
}
