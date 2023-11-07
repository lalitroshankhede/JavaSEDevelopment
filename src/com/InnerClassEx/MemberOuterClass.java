package com.InnerClassEx;

public class MemberOuterClass {

	
	private int data=30;
	
	
	class InnerClass {   //inner class 
		
		void msg()
		{
			System.out.println("Data is : "+data);
		}
	}
	
	public static void main(String[] args) {
		
		MemberOuterClass obj=new MemberOuterClass();
		MemberOuterClass.InnerClass innerClass=obj.new InnerClass();
		innerClass.msg();
	}
	
	
}
