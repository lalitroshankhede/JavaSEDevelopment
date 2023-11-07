package com.InheritanceEx;


class Papa
{
	String property="home";
}

class Child1 extends Papa
{
	String cycle="Miss India Gold";

}

 class Child2 extends Papa{
	String computer="Asus";


}


public class HierarchicalInheritance {

	public static void main(String[] args) {

		Child1 obj=new Child1();

		System.out.println(obj.property+" "+obj.cycle); //to acquire parent as well as own properties

		Child2 obj2=new Child2();
		System.out.println(obj2.property+" "+obj2.computer);

	}


}

