package com.codegnan.fundamentals;

import java.util.Scanner;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base of the triangle");
        double base=s.nextDouble();
        System.out.println("enter height of the triangle:");
        double height=s.nextDouble();
        double area=0.5*base*height;
        System.out.println("area of triangle:"+area);
        s.close();
	}
 
}
