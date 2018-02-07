package factoryDesingPattern;

public class FactoryEnemyShip {
	
	
	public EnemyShip returnChoice(String choice) {
		if(choice == "U") {
			return new UFOEnemyShip();
		}else {
			return new RocketEnemyShip();
		}
	}

}
