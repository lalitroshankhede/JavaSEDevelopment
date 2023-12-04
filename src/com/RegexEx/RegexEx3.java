package com.RegexEx;

import java.util.regex.Pattern;

public class RegexEx3 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "abcd")); //false (not a or m or n) note: in this statment you have only one character not string.
		System.out.println(Pattern.matches("[amn]","a")); // true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "ammmnna")); // false (m and a comes more  than once)
		System.out.println(Pattern.matches("[amn]", "m")); // true (having any one character form "[amn]"
		
	}
}
