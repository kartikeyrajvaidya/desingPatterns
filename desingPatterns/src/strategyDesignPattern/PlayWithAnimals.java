package strategyDesignPattern;

public class PlayWithAnimals {
	
	
	
	public static void main(String[] args) {
		Dogs ishan = new Dogs();
		Birds jayesh = new Birds();
		
		System.out.println(ishan.tryToFly());
		System.out.println(jayesh.tryToFly());
		
		ishan.setFlyingAbility(new ItFlys());
		
		System.out.println(ishan.tryToFly());
	}
	

}
