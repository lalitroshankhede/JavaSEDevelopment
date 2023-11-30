package com.FileHandling;

import java.io.FileInputStream;

public class FileInputStreamReadAllCharacterEx {
public static void main(String[] args) {
		
		try {
			FileInputStream obj=new FileInputStream("D:\\fileDemo\\fileOutputstream.txt");
		 int i=0;
		 
		 while((i=obj.read())!=-1)  //executing loop and reading all character from the file until -1.
		{
			System.out.print((char)i);
		}
			
			
			obj.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
