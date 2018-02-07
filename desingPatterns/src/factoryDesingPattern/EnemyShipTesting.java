package factoryDesingPattern;

import java.util.Scanner;

public class EnemyShipTesting {
	
	
	public static void main(String[] args) {
		
		FactoryEnemyShip factoryEnemyShip = new FactoryEnemyShip();
		
		Scanner sn  = new Scanner(System.in);
		System.out.println("Enter U/R");
		String choice = sn.next();
		EnemyShip enemyShip = factoryEnemyShip.returnChoice(choice);
		
		
		enemyShip.followShip();
		enemyShip.displayEnemyShip();
		enemyShip.damageEnemyShip();
		
	}

}
