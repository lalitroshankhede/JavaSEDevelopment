package com.InheritanceEx;

class Parent{

	int id=101;
	String name="ABC";

}

public class SingleInheritanceEx extends Parent {

	String property="house";



	public static void main(String[] args) {
		SingleInheritanceEx obj=new SingleInheritanceEx();
		System.out.println(obj.id+" "+obj.name+" "+obj.property);
	}
}
