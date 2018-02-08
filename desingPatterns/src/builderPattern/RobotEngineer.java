package builderPattern;

public class RobotEngineer {

	Robotbuilder robotBuilder;
	
	public RobotEngineer(Robotbuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	public Robot getRobot() {
		return robotBuilder.getRobot();
	}
	public void makeRobot() {
		robotBuilder.buildRobotArms();
		robotBuilder.buildRobotHead();
		robotBuilder.buildRobotLegs();
	}
	
}
