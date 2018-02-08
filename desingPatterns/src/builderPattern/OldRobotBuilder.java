package builderPattern;

public class OldRobotBuilder implements Robotbuilder {
	
	Robot robot;

	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setHead("metal head");
	}

	@Override
	public void buildRobotArms() {
		robot.setArms("metal arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setLegs("wooden legs");
	}

	@Override
	public Robot getRobot() {
		
		return this.robot;
	}

}
