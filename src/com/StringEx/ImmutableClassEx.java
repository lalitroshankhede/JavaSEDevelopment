package com.StringEx;

 final class ImmutableEx {

	final String pancardNo ;


	public ImmutableEx(String pancardNo) {
		super();
		this.pancardNo = pancardNo;

	}


	public String getPancardNo() {
		return pancardNo;


	}


}
public class ImmutableClassEx
{
	public static void main(String[] args) {

		ImmutableEx obj=new ImmutableEx("ABC456G65");

		String str=obj.getPancardNo();

		System.out.println("Pancard No. "+ str);
	}


}



