package com.lec.ex5_personinfo;
public class PersonInfoTestMain {
	public static void main(String[] args) {
		int[] arr = new int[2];
//		PersonInfo p1 = new PersonInfo("ȫ�浿", 20, 'm');
//		PersonInfo p2 = new PersonInfo("ȫ���",19,'f');
//		PersonInfo[] person = {p1, p2};

		PersonInfo[] person = {new PersonInfo("ȫ�浿", 20, 'm'),
				               new PersonInfo("ȫ���",19,'f')};
//		PersonInfo[] person = new PersonInfo[2];
//		person[0] = new PersonInfo("ȫ�浿", 20, 'm');
//		person[1] = new PersonInfo("ȫ���",19,'f');
		for(int idx=0 ; idx<person.length ; idx++) {
			person[idx].print();
		}
		for(PersonInfo p : person) {
			p.print();
		}
	}
}
