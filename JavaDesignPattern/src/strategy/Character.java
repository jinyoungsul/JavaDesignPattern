package strategy;

public class Character {
	//접근점
	private Weapon weapon;

	//교체
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void attack(){
		if(weapon == null){
			System.out.println("맨손 공격");
		} else {
			weapon.attack();
		}
	}
	
}
