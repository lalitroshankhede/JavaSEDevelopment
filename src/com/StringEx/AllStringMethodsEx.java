package com.StringEx;

public class AllStringMethodsEx {

	public static void main(String[] args) {

		// length of String

//		String str="HelloJava";
//
//		System.out.println("Length of String is "+str.length());
//

		// convert Uppercase to Lowecase String

//		String str="LALITROSHANKHEDE";
//
//		System.out.println(str.toLowerCase());

		// convert Lowecase to Uppercase String

//		String str="welcome to java program";
//
//		System.out.println(str.toUpperCase());

		// equals method


//		String str1="Sachin";
//		String str2="Tendulkar";
//		String str3=new String("Sachin");
//
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));


		// equalsIgnoreCase
//		String str1="Sachin";
//		String str2="Tendulkar";
//		String str3=new String("SACHIN");
//
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str3));


		//contact method

//		String str1="Sachin ";
//		String str2="Tendulkar";
//
//		String str3=str1.concat(str2);
//
//		System.out.println(str3);


		//trim

//		String str1=" Hello";
//		String str2=" Mr.Lalit ";
//
//		String str3=str1.concat(str2).trim();
//
//		System.out.println(str3);
//


		//startsWith
//
//		String str1="welcome to the java programming";
//
//		System.out.println(str1.startsWith("wel"));


		//endsWith

//		String str="www.google.com/page1/index.html";
//
//		System.out.println(str.endsWith(".html"));
//


		// replace

//		String str1="welcome to the java programming";
//
//	   String result=str1.replace('e', 'o');
//
//	   	System.out.println(result);

		//replaceAll

//		String s1="javatpoint is a very good website";
//
//		String res=s1.replaceAll("a", "e");
//
//		String res2=s1.replaceAll("is a","platform");
//
//		System.out.println(res);
//		System.out.println(res2);

		// contains

//		String s1="javatpoint is a very good website";
//
//		System.out.println(s1.contains("e"));
//		System.out.println(s1.contains("good"));
//		System.out.println(s1.contains("now"));



		//isEmpty

//		String str="";
//		String str1="Hello";
//
//		System.out.println(str.isEmpty());
//		System.out.println(str1.isEmpty());
//

		//join


//		String res=String.join(":","javatpoint", "is"," a"," very"," good"," website");
//
//		System.out.println(res);


		//charAt

//		String str="javatpoint website";
//
//		System.out.println(str.charAt(4));
//
//
		//indexOf

//		  String str="javatpoint website";
//
//		  System.out.println(str.indexOf("i")+" "+str.indexOf("b"));
//


		  //lastindexOf


//		  String str="javatpoint website";
//
//		  System.out.println(str.lastIndexOf("i")+" "+str.lastIndexOf("a"));



		//split

//		String str="welcome to the javatpoint website";
//
//		String strArray[]=str.split("\\s"); //split String based on whitespaces
//
//		for (String string : strArray) {
//
//			System.out.println(string);
//		}



		//substring

		//substring is nothing but string within string to split the string character i.e
		//We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive, and endIndex is exclusive.
		// In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.


//		String str="welcome to the javatpoint website";
//
//		System.out.println(str.substring(5,14)); // we pass the startIndex i.e start from 0 and endIndex i.e start from 1.
//

		//format

//		String str="hello";
//
//		String str1=String.format("name is %s ",str);
//		String str2=String.format("value is %f ",4565.765);
//
//		System.out.println(str1);
//		System.out.println(str2);


		//intern


//		String str1=new String("Hello").intern();
//		String str2=new String("Hello").intern();
//
//		System.out.println(str1==str2);


		//toCharArray

//		String str="welcome to programming zone";
//		char ch[]=str.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//
//			System.out.print(ch[i]);
//		}
//


		//valueOf


//		boolean b1=true;
//        byte b2=11;
//        short sh = 12;
//        int i = 13;
//        long l = 14L;
//        float f = 15.5f;
//        double d = 16.5d;
//        char chr[]={'j','a','v','a'};
//        AllStringMethodsEx obj=new AllStringMethodsEx();
//        String s1 = String.valueOf(b1);
//        String s2 = String.valueOf(b2);
//        String s3 = String.valueOf(sh);
//        String s4 = String.valueOf(i);
//        String s5 = String.valueOf(l);
//        String s6 = String.valueOf(f);
//        String s7 = String.valueOf(d);
//        String s8 = String.valueOf(chr);
//        String s9 = String.valueOf(obj);     //Print Object also String
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s5);
//        System.out.println(s6);
//        System.out.println(s7);
//        System.out.println(s8);
//        System.out.println(s9);
//


	}
}
