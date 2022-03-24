package com.lec.ex09_book3;
// CDLib c = new CDLib("c01","java_cd", "890��-101-1��");
public class CDLib extends CDInfo implements ILendable {
	private String borrower;
	private String checkOutDate;
	private byte state;
	public CDLib(String cdNo, String cdTitle, String bookNo) {
		super(cdNo, cdTitle, bookNo);
	}
	@Override
	public void checkOut(String borrower, String checkoutDate) {
		if(state == STATE_BORROWED) { // �������̸� �޼��� �Ѹ��� ��
			System.out.println(getCdTitle() +" CD�� �������Դϴ�");
			return;
		}
		// state�� 0�̶� ����ó�� ����
		this.borrower = borrower;
		this.checkOutDate = checkoutDate;
		state = STATE_BORROWED; // ������ ���·� ��ȯ
		System.out.println(getCdTitle() + " CD�� ���� ó���Ǿ����ϴ�");
		System.out.println("������ : "+borrower +"\t������ : "+checkoutDate);
	}
	// c.checkIn() �ݳ� : state Ȯ���ؼ� ���Ⱑ��(0)�̸� �޼��� �Ѹ��� �ߴ�, ������(1)�̸� �ݳ�����
	@Override
	public void checkIn() {
		if(state == STATE_NORMAL) {
			System.out.println(getCdTitle() + "CD�� �ݳ��Ϸ�� CD�ε� �̻��մϴ�. ���ܴ�");
			return;
		}
		// state�� ������(1)�̶� �ݳ� ����
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println(getCdTitle() +" CD�� �ݳ� �Ϸ�Ǿ����ϴ�");
	}
	// c.printState() => 101 javaSrc ����å:b01 ������
	@Override
	public void printState() {
		String msg = getCdNo() + "\t"; 
		msg += getCdTitle() + "\t";
		msg += (getBookNo()==null)? "�ܵ�CD\t\t": "����å:"+getBookNo() +"\t";
		msg += ( (state==STATE_NORMAL)? "���Ⱑ��" : (state==STATE_BORROWED)? "������":"�̻���" );
		System.out.println(msg);
	}
	public byte getState() {return state;}
}










