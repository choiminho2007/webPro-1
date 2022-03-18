package com.lec.ex8_staticstudent;
public class StaticStudentTestMain {
	public static void main(String[] args) {
		Student[] students = {new Student("���켺", 90, 91, 91),
				  new Student("���ϴ�", 100, 80, 95),
				  new Student("Ȳ����", 95, 80, 90),
				  new Student("������", 95, 90, 99),
				  new Student("������", 90, 90, 80)};
		int[] tot = new int[5]; // ���� ����(��,��,��,����,���)
		int[] avg = new int[5]; // ���(������)
		printLine('��');
		System.out.println("\t\t\t�� �� ǥ");
		printLine('-');
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		printLine('-');
		for (Student student : students) {
			System.out.println(student.infoString());
			tot[0] += student.getKor();
			tot[1] += student.getEng();
			tot[2] += student.getMat();
			tot[3] += student.getTot();
			tot[4] += student.getAvg();
		}
		for(int idx=0 ; idx<avg.length ; idx++) {
			avg[idx] = tot[idx]/students.length; // ����
			avg[idx] = (int)(tot[idx]/(double)students.length+0.5); // �ݿø�
			avg[idx] = (int)Math.round(tot[idx]/(double)students.length );
		}
		printLine('-');
		System.out.print("����"+"\t\t");
		for(int t : tot) {
//			System.out.print(t+"\t");
			System.out.printf("%4d\t",t);
		}
		System.out.println();
		System.out.print("���"+"\t\t");
		for(int a : avg) {
//			System.out.print(a+"\t");
			System.out.printf("%4d\t",a);
		}
		System.out.println();
		printLine('��');
	}
	private static void printLine(char ch) {
		for(int i=0 ; i<60 ; i++) { // ���ٿ� cnt�� ch�� ���
			System.out.print(ch);
		}
		System.out.println(); // ����
	}
}
