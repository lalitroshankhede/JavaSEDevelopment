package com.Abstraction;

abstract class Accesories {
	final String itemId = "5G43P07";

	static void features() {
		System.out.println(
				"Evey Electronic Items build with Smart Technology and Capable to modifying as per Requirements");
	}

	final void bodyPart() {
		System.out.println("Manufaturing with fully metal equipments : Ref.Id : " + itemId);
	}

	// Note : define method of final or static in abstract class is possible but you
	// cannot override those methods just have to call from extended subclass

	abstract void brandCom();
}

class TV extends Accesories {

	@Override
	void brandCom() {

		features();
		bodyPart();
		System.out.println("Samsung Smart LED TV");
	}

}

public class AccesoriesTest {

	public static void main(String[] args) {

		Accesories obj = new TV();
		obj.brandCom();
	}

}
