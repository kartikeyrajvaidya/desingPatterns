package adapterDesingPattern;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot enemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot newEnemyRobot) {
		enemyRobot= newEnemyRobot;
	}
	
	@Override
	public void fireWeapon() {
		
		enemyRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		
		enemyRobot.walkForward();
	}

	@Override
	public void assingDriver(String driver) {
	
		enemyRobot.reactToHuman();
	}
	


}
