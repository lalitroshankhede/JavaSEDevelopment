package com.DateandTimeExample;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayEx {

	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    LocalDate date = month.atYear(2023);  
	    System.out.println(date);  
	  }  
}
