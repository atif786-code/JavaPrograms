package com.java;

import java.util.Scanner;

public class SumofTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1 , num2;
		num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		num2 = sc.nextInt();
		int sum = num1+ num2;
		System.out.println("The Sum of the two Number is " + sum);
	}

}
