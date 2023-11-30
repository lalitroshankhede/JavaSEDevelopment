package com.FileHandling;

import java.io.FileReader;
 

public class FileReaderEx {

public static void main(String[] args) {
		
		try
		{
			FileReader obj=new FileReader("D:\\fileDemo\\FileWrite.txt");
		   int i;
		    
		    while ((i=obj.read())!=-1) {
				
		    	System.out.print((char)i);
			}
			 
			obj.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
