package prototypeDesingPattern;

public class TestCloning {
	
	public static void main(String[] args) {
		CloneFoctory cloneFactory = new CloneFoctory(); 
		
		Sheep sheep = new Sheep();
		
		Sheep newSheep = (Sheep)cloneFactory.getClone(sheep);
		
		
		System.out.println(sheep);
		System.out.println(newSheep);
	}

}
