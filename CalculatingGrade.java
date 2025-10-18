package com.codegnan.operatorexamples;
import java.util.Scanner;
public class CalculatingGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter marks");
    int studentMarks=scanner.nextInt();
    char grade=(studentMarks>=90)? 'a':(studentMarks>=80)? 'b':(studentMarks>=70)? 'c':
	                                                              (studentMarks>60)? 'd':
	                                                              (studentMarks>50)? 'e':'f';
    System.out.println("student grade is "+ grade);
    scanner.close();
	
	
	}     
	
	

}
