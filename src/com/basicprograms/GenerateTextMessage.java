package com.basicprograms;

import java.util.Scanner;

public class GenerateTextMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input=new Scanner(System.in);

		System.out.println("Enter User name");
		String uname=input.nextLine();

		System.out.println("Hello Mr./Ms." +uname+ " have a good day 😁" );

	}
}
