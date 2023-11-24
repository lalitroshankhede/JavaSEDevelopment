package com.JavaNetworking;

import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.geeksforgeeks.org/java/");

			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());  //if port no. is not given in the URL it returns -1.
			System.out.println("File Name: " + url.getFile());
			System.out.println("Default Port Number: "+url.getDefaultPort());    
			System.out.println("Query String: "+url.getQuery());    
			System.out.println("Path: "+url.getPath());    

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
