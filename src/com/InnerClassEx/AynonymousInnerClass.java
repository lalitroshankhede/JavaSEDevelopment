package com.InnerClassEx;

abstract class Fruits {
	abstract void eat();
}

public class AynonymousInnerClass {

	public static void main(String args[]) 
	{
		Fruits p = new Fruits() 
		{
			void eat() 
			{
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}

}
