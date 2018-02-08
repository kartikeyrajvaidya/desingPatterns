package builderPattern;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotArms;
	private String robotLegs;
	
	
	public void setHead(String head) {
		robotHead = head;

	}

	public void setArms(String arms) {
		robotArms = arms;

	}

	public void setLegs(String legs) {
		robotLegs = legs;
		
	}
	public String getHead() {
		return robotHead;
	}

	public String getArms() {
		return robotArms;
	}

	public String getLegs() {
		return robotLegs;
	}

}
