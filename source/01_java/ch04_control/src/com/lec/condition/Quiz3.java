package com.lec.condition;
import java.util.Scanner;
//����ڷκ��� ����, ����, ���� ������ �Է¹޾� �� ���� ������ ��� �̻����� �̸����� ����� ����
public class Quiz3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������� �Է� : ");
		int kor = scanner.nextInt();
		System.out.print("���������� �Է� : ");
		int eng = scanner.nextInt();
		System.out.print("���������� �Է� : ");
		int math = scanner.nextInt();
		double eve = (kor+eng+math)/3.0;
		if(kor>=eve){
			//System.out.println("���������� �������("+eve+") �̻��Դϴ�");
			System.out.printf("���������� �������(%3.1f)�̻��Դϴ�\n", eve);
		} else if(kor<eve){
			//System.out.println("���������� �������("+eve+") �����Դϴ�");
			System.out.printf("���������� �������(%3.1f)�����Դϴ�\n", eve);
		}
		if(eng>=eve){
			//System.out.println("���������� �������("+eve+") �̻��Դϴ�");
			System.out.printf("���������� �������(%3.1f)�̻��Դϴ�\n", eve);
		}else {
			//System.out.println("���������� �������("+eve+") �����Դϴ�");
			System.out.printf("���������� �������(%3.1f)�����Դϴ�\n", eve);
		}
		if(math>=eve){
			//System.out.println("���������� �������("+eve+") �̻��Դϴ�");
			System.out.printf("���������� �������(%3.1f)�̻��Դϴ�\n", eve);
		}else {
			//System.out.println("���������� �������("+eve+") �����Դϴ�");
			System.out.printf("���������� �������(%3.1f)�����Դϴ�\n", eve);
		}
		scanner.close();
	}
}
