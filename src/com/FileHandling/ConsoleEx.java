package com.FileHandling;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {

		Console obj = System.console();
		System.out.println("Enter Name");
		String name = obj.readLine();

		System.out.println("Name : " + name);
		System.out.println("Enter Password");
		char ch[] = obj.readPassword();
		String pass = String.valueOf(ch); // converting character array into string
		System.out.println("Password : " + pass);

	}
}
