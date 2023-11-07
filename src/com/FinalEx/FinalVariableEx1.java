package com.FinalEx;

class SpeedLimit
{
	final int speedlimit=80;

	public void changeSpeed()
	{
	//	speedlimit=100;  //this is the final variable you can't modify the value.
	}
}


public class FinalVariableEx1 {

	public static void main(String[] args) {

		SpeedLimit obj=new SpeedLimit();
		obj.changeSpeed();
	}

}
