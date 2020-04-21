package day_1;

import java.util.Scanner;

public class Lab2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the length of the classroom: ");
		double length = scnr.nextDouble();
		
		System.out.println("Enter the width of the classroom: ");
		double width = scnr.nextDouble();
		
		double area= length*width;
		double perimeter= 2*(length+width);
		
		System.out.println("The area of the classroom is: " +area);
		System.out.println("The perimeter of the classroom is: " +perimeter);

		
		
	}

}
