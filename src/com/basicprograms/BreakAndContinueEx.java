package com.basicprograms;

public class BreakAndContinueEx {

	public static void main(String[] args) {

		int i;

		System.out.println("========== Break =============");
		for (i = 1; i <= 100; i++) {
			if (i == 50) {

				break;
			}
			System.out.println(i);

		}


		System.out.println("========== Continue =============");

		for (i = 1; i <= 100; i++) {
			if (i == 50) {

				continue;
			}
			System.out.println(i);

		}


	}
}
