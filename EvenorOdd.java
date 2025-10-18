package com.codegnan.operatorexamples;
import java.util.Scanner;
public class EvenorOdd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number:");
			int input = scanner.nextInt();
			String result = (input%2>0)?"it is odd":"it is even";
			System.out.println(result);
			scanner.close();
	}

}
