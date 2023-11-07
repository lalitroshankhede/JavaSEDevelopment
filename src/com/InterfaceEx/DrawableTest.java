package com.InterfaceEx;

interface Drawable
{
	void draw();
}

class Rectangel implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Draw Rectangel []");
	}
	
	
}

class Circle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Draw Circle O");
	}
	
}

public class DrawableTest {

	public static void main(String[] args) {
		
		Drawable obj=new Rectangel();
		Drawable obj2=new Circle();
		
		obj.draw();
		obj2.draw();
	}
}
