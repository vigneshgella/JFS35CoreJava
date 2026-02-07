package com.version1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte value:");
        byte a = sc.nextByte();

        System.out.println("Enter short value:");
        short b = sc.nextShort();

        System.out.println("Enter int value:");
        int c = sc.nextInt();

        System.out.println("Enter long value:");
        long d = sc.nextLong();

        System.out.println("Enter float value:");
        float e = sc.nextFloat();

        System.out.println("Enter double value:");
        double f = sc.nextDouble();

        System.out.println("Enter boolean value:");
        boolean g = sc.nextBoolean();

        System.out.println("Enter string value:");
        String h = sc.next();

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
    }
}
