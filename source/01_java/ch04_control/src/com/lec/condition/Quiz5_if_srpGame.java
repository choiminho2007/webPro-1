package com.lec.condition;

import java.util.Scanner;

// 0 <= Math.random() <1
// 0 <= Math.random()*3 < 3
// (int)(Math.random()*3) : 0,1,2 ���� �ϳ�
public class Quiz5_if_srpGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int you, computer = (int) (Math.random() * 3); // 0,1,2
		System.out.print("����(0), ����(1), ��(2) �� �ϳ� ���� :");
		you = sc.nextInt(); // ������ �Է� ����
		if (you == 0) {
			System.out.print("����� ����\t");
		} else if (you == 1) {
			System.out.print("����� ����\t");
		} else if (you == 2) {
			System.out.print("����� ���ڱ�\t");
		} else {
			System.out.print("����� �߸� �¾��. ����");
			you = 3; // ������ ���� ����
		} // if - you���
		if (you != 3) { // ��ǻ�Ͱ� �� �Ͱ� ���� ���
			String msg = (computer == 0) ? "���� ����" : (computer == 1) ? "���� ����" : "���� ���ڱ�";
			System.out.println(msg);
			if (you == 0) {
				if (computer == 0) {
					System.out.println("����");
				} else if (computer == 1) {
					System.out.println("��ǻ�Ͱ� �̰��");
				} else {
					System.out.println("����� �̰��");
				} // if
			} else if (you == 1) {
				if (computer == 0) {
					System.out.println("����� �̰��");
				} else if (computer == 1) {
					System.out.println("����");
				} else {
					System.out.println("��ǻ�Ͱ� �̰��");
				} // if
			} else if (you == 2) {
				if (computer == 0) {
					System.out.println("��ǻ�Ͱ� �̰��");
				} else if (computer == 1) {
					System.out.println("����� �̰��");
				} else {
					System.out.println("����");
				} // if
			} // if - ���� ���
		} // if
	}// main
}// class