package com.DateandTimeExample;

import java.time.LocalDate;
import java.time.Year;

public class YearEx {

	public static void main(String[] args) {  
	    Year y = Year.now();  
	    LocalDate l = y.atDay(123);  
	    System.out.println(l);  
	    System.out.println(y.length());
	    System.out.println(y.isLeap());
	  }  
}
