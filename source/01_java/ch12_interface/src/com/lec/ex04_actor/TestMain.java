package com.lec.ex04_actor;
public class TestMain {
	public static void main(String[] args) {
		Actor park = new Actor("�ں���");
		park.canCatchCriminal();
		park.canSearch();
		park.outFire();
		park.saveMan();
		park.makePizza();
		park.makeSpaghetti();
		IChef chefPark = new Actor("�ڿ丮��");
//		chefPark.canCatchCriminal(); �Ұ�
		chefPark.makePizza();
		chefPark.makeSpaghetti();
		IFireFighter firePark = new Actor("��");
//		firePark.makePizza(); �Ұ�
		firePark.outFire();
		firePark.saveMan();
		IPoliceMan policePark = new Actor("��");
//		policePark.outFire(); �Ұ�
		policePark.canCatchCriminal();
		policePark.canSearch();
	}
}












