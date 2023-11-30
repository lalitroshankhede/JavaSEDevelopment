package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderClassEx {

	
	public static void main(String[] args) {
		
		try {
			Reader obj=new FileReader("D:\\\\fileDemo\\\\fileWriter.txt");
			
			char data =(char)obj.read();
			while (data!=-1) {
				System.out.print(data);
				data=(char) obj.read();
			}
			
			obj.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
