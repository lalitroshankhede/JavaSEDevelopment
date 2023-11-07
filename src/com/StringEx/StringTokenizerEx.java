package com.StringEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {


	public static void main(String[] args) {

		StringTokenizer st=new StringTokenizer("my name is Lalit");
		while (st.hasMoreTokens()) {

			System.out.println(st.nextToken());

		}

		StringTokenizer str=new StringTokenizer("Welcome to the java programming world :) ");
		System.out.println("Count total no. of Tokens in String : "+str.countTokens());
	}
}
