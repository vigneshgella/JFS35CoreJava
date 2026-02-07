package com.version1;

public class UnaryExample2 {
public static void main(String[] args) {
	int x=50;
	int y=50;
	int result=y-- + --x + y++ + ++x + --x + y-- + ++x + x++ + ++y;
	System.out.println(result);
}
}
