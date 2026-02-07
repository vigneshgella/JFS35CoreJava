package com.version1;

public class TypeCasting {

	public static void main(String[] args) {
			int a=10; //4 bytes source
			
			//double b=(double)a;
			double b=a;//8 bytes destination implicit type conversion
			
			System.out.println(b);//10.00
			
			double c=8.96321145693;//8 bytes Source
			
			short d=(short)c;
			
			System.out.println(d);
	}

}
