package com.lec.ex07_book1;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		Book[] books = {new Book("890��-101-1��","java","ȫ�浿"), 
						new Book("110��-111-1��","dbms","�ű浿"),
						new Book("110��-123-2��","web", "���浿"),
						new Book("770��-123-2��","jsp", "��浿"),
						new Book("110��-123-2��","spring", "��浿")};
		Scanner scanner = new Scanner(System.in);
		int fn; // ��ɹ�ȣ (1:���� | 2:�ݳ� | 3:ålist | 0:����)
		int idx; // �����ϰų� �ݳ��Ϸ��� �� �� ��ȸ�� å�� index
		String bTitle, borrower, checkOutDate; // ����ڿ��� ���� å�̸�, ������, ������
		do {
			System.out.print("1:���� | 2:�ݳ� | 3:ålist | 0:����");
			fn = scanner.nextInt();
			switch (fn) {
			case 1:
				System.out.println("���� �����ϴ� ���� �� ����");
				break;
			case 2:
				System.out.println("�ݳ� �����ϴ� ���� �� ����");
				break;
			case 3:
				System.out.println("å list ��� ���� �� ����");
				break;
			}
		}while(fn!=0);
		System.out.println("BYE");
//		while(true) {
//			System.out.print("1:���� | 2:�ݳ� | 3:ålist | 0:����");
//			fn = scanner.nextInt();
//			if(fn==0) {
//				break;
//			}
		
//		}
		
		
	}// main
}// class












