package com.lec.ex1_student;

public class StudentTestMain {
	public static void main(String[] args) {
		Student s1 = new Student("���켺", 90, 90, 90);
		Student s2 = new Student("���ϴ�", 81, 90, 90);
		Student s3 = new Student("Ȳ����", 91, 90, 90);
		Student s4 = new Student("������", 80, 90, 90);
		Student s5 = new Student("������", 70, 90, 90);
		Student[] student = {s1, s2, s3, s4, s5};
		String[] title = {"�̸�","����","����","����","����","���"};
		printLine();
		System.out.println("\t\t\t����ǥ");
		printLine('-',50);
		for(String t : title) {
			System.out.print('\t'+t);
		}
		System.out.println();
		printLine('-',50);
		for(Student s : student) {
			s.print();
		}
		printLine();
	}
	private static void printLine() {
		for(int i=0 ; i<65 ; i++) {
			System.out.print('��');
		}
		System.out.println();
	}
	private static void printLine(char ch, int cnt) {
		System.out.print("\t");
		for(int i=0 ; i<cnt ; i++) { // ���ٿ� cnt�� ch�� ���
			System.out.print(ch);
		}
		System.out.println(); // ����
	}
}
