package com.lec.ex09_book3;
import java.util.Scanner;
public class BookCDTestMain {
	public static void main(String[] args) {
		BookLib[] books = {new BookLib("b01","java","ȫ�浿"), 
						   new BookLib("b02","dbms","�ű浿"),
						   new BookLib("b03","web", "���浿"),
						   new BookLib("b04","jsp", "��浿"),
						   new BookLib("b11","spring", "��浿")};
		CDLib[] cds = {new CDLib("c01", "java_cd", "b01"),
					   new CDLib("c02", "ITtrend", null),
					   new CDLib("c03", "jsp", "b04") };
		Scanner scanner = new Scanner(System.in);
		int fn; // ��ɹ�ȣ
		int idx; // �����ϰų� �ݳ��Ϸ��� �� �� ��ȸ�� å�� index
		String bTitle, borrower, checkoutDate; // ����ڿ��� ���� å�̸�, ������, ������
		do {
			System.out.print("1:å���� | 2:CD���� | 3:å�ݳ� | 4:CD�ݳ� | 5:������� | 0:����");
			fn = scanner.nextInt();
			switch (fn) {
			case 1:
				//���� : 1.å�̸��Է�  2.å��ȸ 3.å����Ȯ��  4.�������Է� 5.�������Է� 6.����޼ҵ� 7.CD����Ȯ��
				// 1.å�̸��Է�
				System.out.print("�����ϰ��� �ϴ� å�̸��� ?");
				bTitle = scanner.next(); // white-space �ձ����� ��Ʈ���� ����
				// 2.å��ȸ
				for(idx=0 ; idx<books.length ; idx++) {
					if( bTitle.equals(books[idx].getBookTitle()) ){
						break;
					}
				}// å ��ȸ for
				if (idx==books.length) {
					System.out.println("���� �������� ���� �����Դϴ�.");
				}else { // books[idx] ������ ���� ó��
					// 3.å����Ȯ��
					if(books[idx].getState() == BookLib.STATE_BORROWED) { // ����Ұ� ����
						System.out.println("���� �������� �����Դϴ�");
					}else { // ���Ⱑ�ɻ���
						//4.�������Է� 5.�������Է� 6.����޼ҵ� ȣ��
						System.out.print("�����ڴ� ?");
						borrower = scanner.next();
						System.out.print("�������� ?");
						checkoutDate = scanner.next();
						books[idx].checkOut(borrower, checkoutDate);
						// 7.CD����Ȯ��
						int cdIdx;
						for(cdIdx=0 ; cdIdx<cds.length ; cdIdx++) {
							if(books[idx].getBookNo().equals(cds[cdIdx].getBookNo())) {
								break;
							}
						}// ���� CD�� �ִ��� ��ȸ
						if(cdIdx != cds.length) {
							System.out.print("���� CD�� �ֽ��ϴ�. �����Ͻðڽ��ϱ�(y/n)?");
							String answer = scanner.next(); // y�� �Է��� ��� CD ���� ����
							if(answer.equals("y")) {
								cds[cdIdx].checkOut(borrower, checkoutDate);
							} // if - y�� �Է��� ��� cd ���⵵ ����
						}// if - cd�� ���� ��� 
					} // if else - ���� ����
				}
				break;
			case 2 : // CD ����
				System.out.print("�����ϰ��� �ϴ� CD �̸��� ?");
				bTitle = scanner.next();
				// bTitle�� �迭�� �ִ��� �˻��Ͽ� idx ����
				for (idx = 0; idx < cds.length; idx++) {
					if (bTitle.equals(cds[idx].getCdTitle())) {
						break; // CD�̸��� ã������ for���� ��������
					} // if
				} // for-idx����
				if (idx == cds.length) { // ������ å�� �迭�� ���� ���
					System.out.println("���ϴ� CD�� �����ϴ�");
				} else if (idx < cds.length) {// ������ å�� �迭 idx �ε����� �ִ� ���
					if(cds[idx].getState() == CDLib.STATE_BORROWED) { // ����Ұ� ����
						System.out.println("���� �������� CD�Դϴ�");
					}else {
						// cd �����ϱ�
						System.out.print("�������� ? ");
						borrower = scanner.next();
						System.out.print("�������� ? ");
						checkoutDate = scanner.next();
						cds[idx].checkOut(borrower, checkoutDate);
					}
				} // if
				break;
			case 3: // �ݳ� : 1.å�̸�  2.å��ȸ  3.�ݳ� 
				// 1.å�̸�
				System.out.print("�ݳ��� å�̸��� ?");
				bTitle = scanner.next();
				// 2.å��ȸ
				for(idx=0 ; idx<books.length ; idx++) {
					if(bTitle.equals(books[idx].getBookTitle())) {
						break;
					}
				}
				if(idx == books.length) {
					System.out.println("�ش� ������ �� �������� å�� �ƴմϴ�");
				}else {// idx�� ã�� �� ��ġ
					// 3.�ݳ� 
					books[idx].checkIn();
				}
				break;
			case 4 : // CD �ݳ� : 1.CD�̸�  2.CD��ȸ  3.�ݳ� 
				// 1.CD�̸�
				System.out.print("�ݳ��� CD �̸��� ?");
				bTitle = scanner.next();
				// 2. CD��ȸ
				for(idx=0 ; idx<cds.length ; idx++) {
					if(bTitle.equals(cds[idx].getCdTitle())) {
						break;
					}
				}
				if(idx == cds.length) {
					System.out.println("�ش� CD�� �����ϴ�");
				}else {// idx�� ã�� �� ��ġ
					// 3.�ݳ� 
					cds[idx].checkIn();
				}
				break;
			case 5:
				for(BookLib book : books) {
					book.printState();
				}
				for(CDLib cd : cds) {
					cd.printState();
				}
				break;
			}
		}while(fn!=0);
		System.out.println("BYE");
		scanner.close();
	}// main
}// class












