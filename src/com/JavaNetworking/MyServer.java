package com.JavaNetworking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer  {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(5062);
			Socket s = ss.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("message= " + str);
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
