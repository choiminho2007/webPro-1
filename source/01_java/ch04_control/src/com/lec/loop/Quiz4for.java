package com.lec.loop;
// 2~9�ܱ��� ���
//2*1=2	3*1=3	4*1=4	5*1=5	6*1=6	7*1=7	8*1=8	9*1=9	
//2*2=4	3*2=6	4*2=8	5*2=10	6*2=12	7*2=14	8*2=16	9*2=18	
public class Quiz4for {
	public static void main(String[] args) {
		for(int i=1 ; i<10 ; i++) { // 1~9����
			for(int j=2 ; j<10 ; j++) { // 2�ܺ��� 9�ܱ���
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println(); // ����
		}
	}
}
