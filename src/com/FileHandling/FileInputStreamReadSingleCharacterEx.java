package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamReadSingleCharacterEx {

	public static void main(String[] args) {
		
		try {
			FileInputStream obj=new FileInputStream("D:\\fileDemo\\fileOutputstream.txt");
			int i=obj.read();
			System.out.println((char)i);
			
			obj.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
