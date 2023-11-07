package com.Array;

public class SingleDimArrayEx {


	public static void main(String[] args) {




		int arr[]= {1,2,3,4,5};


		System.out.println("==================== Array with initilize elements =============");

		for (int element : arr) {

			System.out.println(element);
		}



		System.out.println("=========== Print Array in Reverse Order =========");


		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}



//		int array[]=new int[5];
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter the Element for Array");
//
//		for (int i = 0; i < array.length; i++) {
//
//			array[i]=input.nextInt();
//		}
//
//
//		System.out.println("============== Array element form taking input from user ========");
//
//		System.out.println("Array Elements are : ");
//		for (int i = 0; i < array.length; i++) {
//
//			System.out.println(array[i]);
//		}
//
//
//
//
//		int[] foreachArray=new int[5];
//		Scanner input2=new Scanner(System.in);
//		System.out.println("Enter the Element for Array2");
//
//		for (int i = 0; i < foreachArray.length; i++) {
//
//			foreachArray[i]=input2.nextInt();
//		}
//
//		System.out.println("============= Array with forEach loop ===========");
//		for(int eleArray: foreachArray)
//		{
//			System.out.println(eleArray);
//		}
//



		System.out.println("=============== Array with Method =============");


		int[] arrayMethod= {4,6,3,2,67,2,1,5,67};

		getArray(arrayMethod);

	}


	/*======================= Array with Method ======================== */



	public static void getArray(int arrMethod[])
	{

		for (int element : arrMethod) {

			System.out.println(element);
		}

	}


}
