package factoryDesingPattern;

public class EnemyShip {
	public String name;
	public int amtDamage;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(int amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followShip() {
		System.out.println("Enemy: "+getName()+"  Follow HeroShip");
	}	
	public void displayEnemyShip() {
		System.out.println("Enemy: "+getName()+" is On Screen");
	}	
	public void damageEnemyShip() {
		System.out.println("Enemy: "+getAmtDamage()+"  ");
	}	
	
}
