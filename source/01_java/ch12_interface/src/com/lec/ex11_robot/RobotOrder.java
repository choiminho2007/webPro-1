package com.lec.ex11_robot;
// RobotOrder order = new RobotOrder();
// order.action(drawRobot�� ��ü);
public class RobotOrder {
	public void action(Robot robot) {
		if(robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		}else if(robot instanceof DanceRobot) {
			((DanceRobot) robot).dance();
		}else if(robot instanceof DrawRobot) {
			((DrawRobot) robot).draw();
		}else {
			System.out.println("Ȯ��� �κ��̸� �̰��� �����ϼ���");
		}
	}
}
