package com.codegnan.controls;

import java.util.Scanner;

public class AtmWithdrawal {

	public static void main(String[] args) {
	
	      double balance=10000;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter  withdraw Amount");
		double withdrawAmount = scanner.nextDouble();
		/// if syntax
		if (withdrawAmount<=balance) {
			balance-=withdrawAmount;
		
			System.out.println("the Amount " + withdrawAmount + "is withdrawal");
		} else {
			
		
		System.out.println("insufficient funds");
	}

	}
}
