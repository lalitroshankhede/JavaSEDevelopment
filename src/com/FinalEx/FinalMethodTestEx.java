package com.FinalEx;

class Apple
{
	final void getApple()
	{
		System.out.println("This is Red Apple");
	}
}

class ChildApple extends Apple
{

//   public void getApple()
//   {
//	   System.out.println("This is Parent Class Apple");
//   }              // You can't override this method becoz of final keyword

	public void getChildApple()
	{

		System.out.println("This is Green Apple");
	}
}
public class FinalMethodTestEx {

	public static void main(String[] args) {

		ChildApple obj=new ChildApple();
		obj.getApple();
		obj.getChildApple();
	}

}
