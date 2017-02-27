package strategy;

public class Main {
	public static void main(String[] args) {
		Character character = new Character();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
	}
}
