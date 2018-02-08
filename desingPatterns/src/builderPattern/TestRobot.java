package builderPattern;

public class TestRobot {
	public static void main(String[] args) {

		Robotbuilder robotbuilder = new OldRobotBuilder();

		RobotEngineer robotEngineer = new RobotEngineer(robotbuilder);

		robotEngineer.makeRobot();

		Robot testRobot = robotEngineer.getRobot();

		System.out.println(testRobot.getHead());

	}
}
