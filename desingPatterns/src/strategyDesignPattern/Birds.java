package strategyDesignPattern;

public class Birds extends Animal{
	
	public Birds() {
		super();
		flyType = new ItFlys();
	}
}
