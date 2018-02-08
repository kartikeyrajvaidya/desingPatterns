package adapterDesingPattern;

public class EnemyTank implements EnemyAttacker {

	
	
	@Override
	public void fireWeapon() {
	
		System.out.println("EnemyTank FireWeapon");

	}

	@Override
	public void driveForward() {
			
		System.out.println("EnemyTank driveForward");
		
	}

	@Override
	public void assingDriver(String driver) {
		
		System.out.println("EnemyTank driveForward"+ driver);

	}

}
