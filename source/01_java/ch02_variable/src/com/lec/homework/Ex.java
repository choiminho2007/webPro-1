package com.lec.homework;

public class Ex {
	public static void main(String[] args) {
		int kor = 99;
		int mat = 100;
		int eng = 99;
		int sum = kor + mat + eng;
		double avg = sum/3.0;
		System.out.printf("����� %d��, ������ %d��, ����� %d���Դϴ�.\n", 
														kor, mat, eng);
		System.out.printf("������ %d��. ����� %.1f", sum, avg);
	}
}
