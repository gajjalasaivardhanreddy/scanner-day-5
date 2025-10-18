package com.codegnan.fundamentals;
import java.util.Scanner;
public class SimpleInterest {
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principle amount :");
		Double Price = s.nextDouble();
		System.out.println("Enter the Rate of interset :");
		Double Rate = s.nextDouble();
		System.out.println("Enter the Time(years):");
		Double time = s.nextDouble();
		Double interest = (Price*Rate*time)/100;
		System.out.println("Interset:"+interest);
		Double total = Price+interest; 
		System.out.println("Total amount:"+total);
		s.close();
	}

}
