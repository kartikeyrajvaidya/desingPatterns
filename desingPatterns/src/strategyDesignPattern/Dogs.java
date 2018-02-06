package strategyDesignPattern;

public class Dogs extends Animal {

	public Dogs() {
		super();
		flyType = new CantFly();
	}
}
