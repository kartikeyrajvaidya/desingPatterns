package strategyDesignPattern;

public class Animal {

	public Flys flyType;

	public String tryToFly() {
		return flyType.flys();
	}
	
	public void setFlyingAbility(Flys newflyType) {
		flyType = newflyType;
	}
}
