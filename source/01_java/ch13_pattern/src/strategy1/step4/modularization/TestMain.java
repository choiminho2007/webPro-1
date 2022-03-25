package strategy1.step4.modularization;

public class TestMain {
	public static void main(String[] args) {
		Robot robot = new SuperRobot();
		robot.actionFly();
//		robot.setFly(new FlyNo());  5단계 외부에서 업그레이드 가능하도록
	}
}
