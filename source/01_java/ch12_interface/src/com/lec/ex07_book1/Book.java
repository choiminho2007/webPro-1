package com.lec.ex07_book1;
// Book b = new Book("890ㅁ-101-1ㄱ","java","홍길동")
public class Book implements ILendable {
	private String bookNo;    // 책번호 890ㅁ-101-1ㄱ
	private String bookTitle; // 책제목
	private String writer;    // 저자
	private String borrower;  // 대출인
	private String checkOutDate; // 대출일
	private byte state;       // 대출중(1), 대출가능(0)
	public Book(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
//		borrower = null;
//		checkOutDate = null;
//		state = STATE_NORMAL;
	} 
	// b.checkOut("신길동","03-23"); 대출 : 상태를 확인해서 대출중이면 중단, 대출가능이면 대출처리
	@Override
	public void checkOut(String borrower, String checkoutDate) {
		if(state == STATE_BORROWED) { // 대출중이면 메세지 뿌리고 끝
			System.out.println(bookTitle +" 도서는 대출중입니다");
			return;
		}
		// state가 0이라 대출처리 진행
		this.borrower = borrower;
		this.checkOutDate = checkoutDate;
		state = STATE_BORROWED; // 대출중 상태로 전환
		System.out.println(bookTitle + " 도서가 대출 처리되었습니다");
		System.out.println("대출인 : "+borrower +"\t대출일 : "+checkoutDate);
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
