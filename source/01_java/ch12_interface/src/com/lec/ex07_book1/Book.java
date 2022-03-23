package com.lec.ex07_book1;
// Book b = new Book("890��-101-1��","java","ȫ�浿")
public class Book implements ILendable {
	private String bookNo;    // å��ȣ 890��-101-1��
	private String bookTitle; // å����
	private String writer;    // ����
	private String borrower;  // ������
	private String checkOutDate; // ������
	private byte state;       // ������(1), ���Ⱑ��(0)
	public Book(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
//		borrower = null;
//		checkOutDate = null;
//		state = STATE_NORMAL;
	} 
	// b.checkOut("�ű浿","03-23"); ���� : ���¸� Ȯ���ؼ� �������̸� �ߴ�, ���Ⱑ���̸� ����ó��
	@Override
	public void checkOut(String borrower, String checkoutDate) {
		if(state == STATE_BORROWED) { // �������̸� �޼��� �Ѹ��� ��
			System.out.println(bookTitle +" ������ �������Դϴ�");
			return;
		}
		// state�� 0�̶� ����ó�� ����
		this.borrower = borrower;
		this.checkOutDate = checkoutDate;
		state = STATE_BORROWED; // ������ ���·� ��ȯ
		System.out.println(bookTitle + " ������ ���� ó���Ǿ����ϴ�");
		System.out.println("������ : "+borrower +"\t������ : "+checkoutDate);
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printState() {
		// TODO Auto-generated method stub

	}

}
