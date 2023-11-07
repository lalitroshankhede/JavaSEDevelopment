package com.DynamicMethodDispatchEx;

import java.time.LocalDateTime;

class Phone
{
	public void showTime()
	{
		System.out.println(LocalDateTime.now());
	}

	public void on()
	{
		System.out.println("Turning on Phone...");
	}
}

class SmartPhone extends Phone
{
	public void playMusic()
	{
		System.out.println("Playing Music...");
	}
	@Override
	public void on()
	{
		System.out.println("Turning on SmartPhone....");
	}
}

public class DynamicMethodEx {

	public static void main(String[] args) {

		Phone obj1=new Phone();

		obj1.showTime();
		obj1.on();

		System.out.println("=============");

		SmartPhone obj2=new SmartPhone();
		obj2.showTime();
		obj2.playMusic();
		obj2.on();
		System.out.println("==============");

		Phone obj3=new SmartPhone();
		obj3.showTime();
		obj3.on();
		// obj3.playMusic();  //gives C.T Error becoz referes of Phone class refer to instance of SmartPhone class and calling method of SubClass it is not allowed

	}
}
