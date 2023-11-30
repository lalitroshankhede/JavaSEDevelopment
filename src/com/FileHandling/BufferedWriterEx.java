package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {

	
	public static void main(String[] args) {
		
	  
		try {
			
			FileWriter obj=new FileWriter("D:\\fileDemo\\bufferedWriter.txt");
			BufferedWriter bufferedWriter=new BufferedWriter(obj);
			
			bufferedWriter.write("Welcome to New World");
			bufferedWriter.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("Success");
		
		
	}
}
