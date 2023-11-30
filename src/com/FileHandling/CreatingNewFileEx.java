package com.FileHandling;

import java.io.File;

public class CreatingNewFileEx {

	
	public static void main(String[] args) {
		
		try {
			
			File obj=new File("newFile1.txt");
			
			obj.createNewFile();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		System.out.println("Success");
		
	}
}
