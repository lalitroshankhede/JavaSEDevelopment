package com.InstanceInitilizerBlock;

class ParentP1
{
	int x=100;
	public ParentP1() {
		// TODO Auto-generated constructor stub

		System.out.println("This is Parent Constructor value of X : "+x);
	}

}

class ChildC1 extends ParentP1
{
	int y;


	public ChildC1()
	{
		System.out.println("This is Child Constructor value of Y : "+y);
	}


	{
		System.out.println("Instance Initializer Block ");
		y=1000;
	}
}


public class InstanceInitilizerTest {


	public static void main(String[] args) {

		ChildC1 obj=new ChildC1();
		ChildC1 obj2=new ChildC1();

	}
}
