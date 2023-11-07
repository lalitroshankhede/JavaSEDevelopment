package com.InheritanceEx;


class A1
{

	private int id=101;
    private String msg="Welcome to Java";


    public int getVal()
    {
    	return id;
    }
    public String getMsg()

    {
    	return msg;
    }
}

class B1 extends A1
{

	private String gift="Gold";

	 public String getfromParent()
	 {
		 int idfromParent=getVal();
		 String msgfromParent =getMsg();

		 return idfromParent+" "+ msgfromParent+" "+gift;
	 }
}

public class PracticeOnInheritanceEx2 {

	public static void main(String[] args) {

		B1 obj=new B1();

		System.out.println(obj.getfromParent());
	}
}
