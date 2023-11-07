package com.InterfaceEx;

interface StaticEx
{
	void draw();
	
	static int squre(int x)
	{
		return x*x; 
	}
}


public class StaticMethodInterfaceEx implements StaticEx {

	

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("This is Static Method in Interface Example");
	}
	
	
	public static void main(String[] args) {
		
		StaticEx obj=new StaticMethodInterfaceEx();
		obj.draw();
		System.out.println(StaticEx.squre(5));
		
		
	}
	
	

	
}
