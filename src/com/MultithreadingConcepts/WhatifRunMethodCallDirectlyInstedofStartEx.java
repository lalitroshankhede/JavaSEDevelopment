package com.MultithreadingConcepts;

public class WhatifRunMethodCallDirectlyInstedofStartEx extends Thread{

/* Note : 1. Each thread starts in a separate call stack.
          2. Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than 
             at the beginning of a new call stack.
 */            
	
	public void run()
	{
		 for(int i=1;i<5;i++){  
			    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			    System.out.println(i);  
			  }  
	}
	
	public static void main(String[] args) {
		
		WhatifRunMethodCallDirectlyInstedofStartEx obj1=new WhatifRunMethodCallDirectlyInstedofStartEx();
		WhatifRunMethodCallDirectlyInstedofStartEx obj2=new WhatifRunMethodCallDirectlyInstedofStartEx();
		
		obj1.run();   //fine, but does not start a separate call stack  
		obj2.run();
	}
}

// Conclusion is : As we can see in the above program that there is no context-switching because 
//                 here t1 and t2 will be treated as normal object not thread object.
