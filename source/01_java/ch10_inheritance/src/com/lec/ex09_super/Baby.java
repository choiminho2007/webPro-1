package com.lec.ex09_super;
// name, character / intro()
// Baby b = new Baby("ȫ�ư�", "�̻�");
// Bagy b1 = new Baby();
public class Baby extends Person{
	public Baby() {
		System.out.println("�Ű����� ���� Baby ������");
	}
	public Baby(String name, String character) {
		super(name, character);
//		setName(name); setCharacter(character);
		System.out.println("�Ű����� �ִ� Baby ������");
	}
	@Override
	public void intro() {
		System.out.print("���� ���� �� �ư��� ");
		super.intro(); // �� Ŭ������ ���۴��� intro()
	}
}
