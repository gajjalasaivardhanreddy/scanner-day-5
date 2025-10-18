package com.codegnan.operatorexamples;
import java.util.Scanner;
public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int input = scanner.nextInt();
		String result = (input%5>0)?"it is not divisible by 5":"it is divisible by 5";
		System.out.println(result);
		scanner.close();
	}

}
