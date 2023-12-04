package com.RegexEx;

import java.util.regex.Pattern;

public class CompletePasswordMatcher {

	public static void main(String[] args) {
		
             System.out.println(Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", "pass@123"));
             //false at least one Capital Letter required.
             
             System.out.println(Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", "Pass@"));
             //false at least one Digit required.
             
             
             System.out.println(Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", "Pass123"));
             //false at least special symbol required.
             
             
             System.out.println(Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", " P@123"));
             //false at least more than one small charater required.
             
             
             System.out.println(Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", " Pass@123"));
             //true Eveything is Ok. 
             
            
             
             
	}
}
