package com.FileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamEx {

	
	public static void main(String[] args) {
		
		try {
			FileInputStream obj=new FileInputStream("D:\\fileDemo\\fileOutputstream.txt");
			DataInputStream dataInputStream=new DataInputStream(obj);
			int count=dataInputStream.read();
			
			byte arr[]=new byte[count];
			
			dataInputStream.read(arr);
			
			for (byte b : arr) {
				char ch=(char) b;
				
				System.out.print(ch+" ");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
