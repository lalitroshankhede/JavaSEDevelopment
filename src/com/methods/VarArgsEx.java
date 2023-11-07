package com.methods;

public class VarArgsEx {


	public static int varArgument(int ...arr)
	{

		int sum=0;

		for(int ele:arr)

		{
			sum=sum+ele;
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Sum of Two "+varArgument(4,5));
		System.out.println("Sum of Three "+varArgument(4,5,7));
		System.out.println("Sum of Four "+varArgument(4,5,8,9));

	}

}
