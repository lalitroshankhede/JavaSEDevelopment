package com.FileHandling;

import java.io.FileWriter;
import java.io.Writer;

public class WriterClassEx {

	
	public static void main(String[] args) {
		
		try {
			
			Writer obj=new FileWriter("D:\\fileDemo\\fileWriter.txt");
			String content="I Love my Country";
			obj.write(content);
			obj.close();
			System.out.println("Done");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
