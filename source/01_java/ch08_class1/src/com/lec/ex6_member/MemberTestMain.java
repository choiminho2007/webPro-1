package com.lec.ex6_member;

public class MemberTestMain {
	public static void main(String[] args) {
		Member member = new Member("aaa", "xxx", "ȫ�浿", "hong@company.com",
                					"���� ������", "2000-01-01", 'M');
		System.out.println(member.infoString() );
	}
}
