package com.lec.ex09_book3;
// BookLib b = new BookLib("890��-101-1��","java","ȫ�浿")
public class BookLib extends BookInfo implements ILendable {
	private String borrower;  // ������
	private String checkOutDate; // ������
	private byte state;       // ������(1), ���Ⱑ��(0)
	public BookLib(String bookNo, String bookTitle, String writer) {
		super(bookNo, bookTitle, writer);
//		borrower = null;
//		checkOutDate = null;
//		state = STATE_NORMAL;
	} 
	// b.checkOut("�ű浿","03-23"); ���� : state�� Ȯ���ؼ� ������(1)�̸� �ߴ�, ���Ⱑ��(0)�̸� ����ó��
	@Override
	public void checkOut(String borrower, String checkoutDate) {
		if(state == STATE_BORROWED) { // �������̸� �޼��� �Ѹ��� ��
			System.out.println(getBookTitle() +" ������ �������Դϴ�");
			return;
		}
		// state�� 0�̶� ����ó�� ����
		this.borrower = borrower;
		this.checkOutDate = checkoutDate;
		state = STATE_BORROWED; // ������ ���·� ��ȯ
		System.out.println(getBookTitle() + " ������ ���� ó���Ǿ����ϴ�");
		System.out.println("������ : "+borrower +"\t������ : "+checkoutDate);
	}
	// b.checkIn() �ݳ� : state Ȯ���ؼ� ���Ⱑ��(0)�̸� �޼��� �Ѹ��� �ߴ�, ������(1)�̸� �ݳ�����
	@Override
	public void checkIn() {
		if(state == STATE_NORMAL) {
			System.out.println(getBookTitle() + "������ �ݳ��Ϸ�� å�ε� �̻��մϴ�. ���ܴ�");
			return;
		}
		// state�� ������(1)�̶� �ݳ� ����
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println(getBookTitle() +" ������ �ݳ� �Ϸ�Ǿ����ϴ�");
	}
	// b.printState() => 890��-101-1�� java(ȫ�浿 ����) ������
	@Override
	public void printState() {
		if(state==STATE_NORMAL) {
			System.out.println(getBookNo() + "\t" + getBookTitle() + "(" + getWriter() + "����) ���Ⱑ��");
		}else if(state==STATE_BORROWED) {
			System.out.println(getBookNo() + "\t" + getBookTitle() + "(" + getWriter() + "����) ������");
		}else {
			System.out.println(getBookNo() + "\t" + getBookTitle() + "(" + getWriter() + "����) �̻���");
		}
//		String msg = getBookNo() + "\t" + getBookTitle() + "(" + getWriter() + "����)";
//		msg = msg + ( (state==STATE_NORMAL)? "���Ⱑ��" : (state==STATE_BORROWED)? "������":"�̻���" );
//		System.out.println(msg);
	}
	public String getBorrower() {return borrower;}
	public String getCheckOutDate() {return checkOutDate;}
	public byte getState() {return state;}
}














