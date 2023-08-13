package chapter02;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main (String args[]) {
		//Create Scanner object and assign its reference to input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter radius value
		System.out.print("Please enter a number for radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.142;
		
		System.out.println("The area of the circle with radius " + radius + " is "+ area );	
	}
}
