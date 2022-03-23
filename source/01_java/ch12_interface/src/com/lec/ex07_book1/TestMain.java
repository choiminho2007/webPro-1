package com.lec.ex07_book1;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		Book[] books = {new Book("890ㅁ-101-1ㄱ","java","홍길동"), 
						new Book("110ㄱ-111-1ㄱ","dbms","신길동"),
						new Book("110ㅁ-123-2ㅌ","web", "유길동"),
						new Book("770ㅁ-123-2ㅌ","jsp", "고길동"),
						new Book("110ㅁ-123-2ㅌ","spring", "김길동")};
		Scanner scanner = new Scanner(System.in);
		int fn; // 기능번호 (1:대출 | 2:반납 | 3:책list | 0:종료)
		int idx; // 대출하거나 반납하려고 할 때 조회된 책의 index
		String bTitle, borrower, checkOutDate; // 사용자에게 받을 책이름, 대출인, 대출일
		do {
			System.out.print("1:대출 | 2:반납 | 3:책list | 0:종료");
			fn = scanner.nextInt();
			switch (fn) {
			case 1:
				System.out.println("대출 진행하는 로직 들어갈 예정");
				break;
			case 2:
				System.out.println("반납 진행하는 로직 들어갈 예정");
				break;
			case 3:
				System.out.println("책 list 출력 로직 들어갈 예정");
				break;
			}
		}while(fn!=0);
		System.out.println("BYE");
//		while(true) {
//			System.out.print("1:대출 | 2:반납 | 3:책list | 0:종료");
//			fn = scanner.nextInt();
//			if(fn==0) {
//				break;
//			}
		
//		}
		
		
	}// main
}// class












