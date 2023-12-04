package com.RegexEx;

import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
 		
             
		System.out.println(Pattern.matches(".s","as")); // true (2nd char is s)
		System.out.println(Pattern.matches(".s","mk")); // false (2nd char is not s)
		System.out.println(Pattern.matches(".s","mst")); // false (has more than 2 char)
		System.out.println(Pattern.matches(".s","amms"));// false (has more than 2 char)
		System.out.println(Pattern.matches("..s","mas")); // true (3rd char is s) Imp : use double dot
		System.out.println(Pattern.matches("..s","sas")); //  true (3d char is s) Imp : use double dot
		System.out.println(Pattern.matches(".s","sam")); //false (not any last character s.
	}
}
