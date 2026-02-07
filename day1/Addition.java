package com.version1;

import java.util.Scanner;

public class Addition {
		public static void main(String[] args) {
			//hardcoated values
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value:");
			int a=sc.nextInt();
			System.out.println("Enter b value:");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Addition is:"+c);
		}
		
}
