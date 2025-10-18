 package com.codegnan.fundamentals;
import java.util.Scanner;
public class RadiusCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        //  enter radius
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area
        //area=pi*r*r
        double area = 3.14* radius * radius;

        // Display result with two decimal places
        System.out.println("area of the circle:"+area);

        input.close();

	}

}

