package com.FinalEx;

final class Father
{

	public void getFatherProp()
	{
		System.out.println("House");
	}
}

// you can not extends Father class becoz class is final
class Child //  extends Father
{
	public void getChildProp()
	{
		System.out.println("Bike");
	}
}
public class FinalClassTestEx {


	public static void main(String[] args) {

		Child obj=new Child();
		obj.getChildProp();
	}

}
