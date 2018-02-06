package strategyDesignPattern;

public interface Flys {
	String flys();
}

class ItFlys implements Flys{

	@Override
	public String flys() {
		
		return "Flying High";
		
	}
	
}
class CantFly implements Flys{

	@Override
	public String flys() {
		
		return "Can't Fly";
		
	}
	
}
