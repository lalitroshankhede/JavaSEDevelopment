package com.ConstructorInheritanceEx2;


class Parent
{
      int x;

    public Parent() {

    	System.out.println("I am From Parent class the value of X is "+x);
	}

    public Parent(int x)
    {

       System.out.println("This is Paramaterized Parent Constructor value of  x"+x);
    }
}

class Child extends Parent
{

	   int y;

	   public Child()
	   {

		   super.x=10000;
		   System.out.println("Get Value from Parent class "+super.x);
		   System.out.println("I from Child Class the value of y is "+y);
	   }

	   public Child(int x,int y)
	   {

		   super(100);
		   System.out.println("This is Paramaterized Child Constructor value of x and  y is "+x+" "+y);
	   }

}

public class ConsturctorInhriMain {

	public static void main(String[] args) {

		Child ob=new Child();
		Child obj=new Child(10,20);


	}
}
