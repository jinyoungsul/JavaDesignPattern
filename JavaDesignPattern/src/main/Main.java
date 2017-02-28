package main;

import adapter.Adapter;
import adapter.AdapterImpl;
import strategy.Character;
import strategy.Knife;
import strategy.Sword;

public class Main {

	public static void main(String[] args) {
		
		//strategy pattern//
//		Character character = new Character();
//		
//		character.attack();
//		
//		character.setWeapon(new Knife());
//		character.attack();
//		
//		character.setWeapon(new Sword());
//		character.attack();
		
		//////////////////
		
		
		
		//adapter pattern//
		// 요구사항
		// 두 수에 대한 다음 연산을 수행하는 객체를 만들어라
		// 수의 두 배 수를 반환 : twiceOf(Float):Float
		// 수의 반의 수를 반환 : halfOf(Float):Float
		// 구현 객체 이름은 Adapter
		// Math 클래스에서 두 배와 절반을 구하는 함수는 이미 구현
		
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.halfOf(100f));
		System.out.println(adapter.twiceOf(100f));
		
		//////////////////
	}

}
