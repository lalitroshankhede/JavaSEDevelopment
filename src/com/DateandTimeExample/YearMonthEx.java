package com.DateandTimeExample;

import java.time.Period;
import java.time.YearMonth;

public class YearMonthEx {

	public static void main(String[] args) {
		
		 YearMonth ym = YearMonth.now();  
		  System.out.println(ym);  
		  YearMonth ym2 = ym.plus(Period.ofYears(2));
		  YearMonth ym3 = ym.minus(Period.ofYears(2));  
		  System.out.println(ym2);
		  System.out.println(ym3);  
	}
}
