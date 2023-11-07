package com.Abstraction;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw Rectangle");
		
	}
	
}

class Circle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Draw Circle");
	}
	
}
public class ShapeTest {

	public static void main(String[] args) {
		
		Shape obj=new Circle();
		obj.draw();
	}
}
