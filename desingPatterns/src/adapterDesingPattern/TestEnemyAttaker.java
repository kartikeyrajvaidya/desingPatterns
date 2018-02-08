package adapterDesingPattern;

public class TestEnemyAttaker {

	public static void main(String[] args) {
		EnemyRobot enemyRobot = new EnemyRobot();
		EnemyTank enemyTank = new EnemyTank();
		
		EnemyAttacker enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
		
		
		enemyRobotAdapter.driveForward();
		enemyRobotAdapter.fireWeapon();
		enemyRobotAdapter.assingDriver("kartikey");
	}
}
