package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	
	public static void main(String[] args) throws IOException {
		
		FileReader obj=new FileReader("D:\\fileDemo\\bufferedWriter.txt");
		
		BufferedReader bufferedReader=new BufferedReader(obj);
		
		int i;
		
		while ((i=obj.read())!=-1) {
			System.out.print((char)i);
		}
		
		obj.close();
		bufferedReader.close();
	}
}

