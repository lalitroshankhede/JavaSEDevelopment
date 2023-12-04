package com.RegexEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile(".s"); //represent single character
		Matcher matcher=p.matcher("as");
		
		// 1st Way 
		
		boolean checkCase1=matcher.matches();
		
		
		//2nd Way 
		
		boolean checkCase2=Pattern.compile(".s").matcher("as").matches();
		
		
		//3rd Way 
		
		boolean checkCase3=Pattern.matches(".s","as");
		
		System.out.println(checkCase1+" "+checkCase2+" "+checkCase3);
		
		
		
		
	}
}
