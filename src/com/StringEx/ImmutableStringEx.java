package com.StringEx;

public class ImmutableStringEx {


	public static void main(String[] args) {

//		String sc="Sachin";
//	    sc.concat(sc);
//
//	    System.out.println(sc); // it will print only sachin because JVM created new object as "Sachin" in string constant pool and refer to the same
//	                           // value


//		String sc="Sachin";
//	   sc= sc.concat(sc);
//
//	    System.out.println(sc);   // Now, it will print Sachin Tendulkar because JVM created new object i.e Sachin Tendular and explicitly assign
	                             // refer to the newly created object. Note: Still Sachin is not changed.

	    String sc=50+80+"Hello"+100+100;

	    System.out.println(sc);


	}

}
