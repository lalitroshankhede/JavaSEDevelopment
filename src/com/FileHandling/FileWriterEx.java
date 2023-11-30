package com.FileHandling;

import java.io.FileWriter;

public class FileWriterEx {

	
	public static void main(String[] args) {
		
		try
		{
			FileWriter obj=new FileWriter("D:\\fileDemo\\FileWrite.txt");
			obj.write("Hello my name is Lalit");
			System.out.println("Success");
			obj.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
