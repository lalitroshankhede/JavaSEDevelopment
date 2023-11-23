package com.testprograms;

 

public class Demo   {

	
	
	
     public static void main(String[] args) {
		
    	 // Integer Datatype
//    	  Integer a=100;
//    	  Integer b=100;
//    	  
//    	  Integer c=new Integer(500);
//    	  Integer d=new Integer(500);
//    	  
//    	  int num1=400;
//    	  int num2=400;
//    	  
//    	  
//    	  boolean res1=(a==b);
//    	  boolean res2=(c==d);
//    	  
//    	  boolean res3=(num1==num2);
//    	  
//    	  System.out.println(res1);
//    	  System.out.println(res2);
//    	  
//    	  System.out.println(res3);
//    	  
    	  
    	  
    	  
    	  // String Datatype
    	  
    	  String str1="Welcome";
    	  String str2="Welcome";
    	  String str3="WelHello";
    	  
    	  System.out.println(str1==str2); //true
    	  System.out.println(str1==str3); //false
    	  System.out.println(str2==str3); //false
    	  
    	  System.out.println("=========================================");
    	  String string=new String("Java");
    	  String string2=new String("Python");
    	  String string3=new String("JAVA");
    	  
    	  
    	  System.out.println(string==string2); //false
    	  System.out.println(string==string3); //false
    	  System.out.println(string2==string3); //false
    	  System.out.println(string.equalsIgnoreCase(string3)); //true
    	  
    	  
	}
     
 	

}
