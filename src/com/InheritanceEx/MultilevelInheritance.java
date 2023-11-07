package com.InheritanceEx;


class GrandFather
{
	String property="Home";

}

class Father extends GrandFather
{
	String car="XUV500";

}

public class MultilevelInheritance extends Father {

	String bike="Yamaha250";

	public static void main(String[] args) {

		MultilevelInheritance obj=new MultilevelInheritance();
		System.out.println(obj.property+"  "+obj.car+" "+obj.bike);
	}
}
