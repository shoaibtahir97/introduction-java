package chapter02;
public class ComputeArea {
	public static void main(String args[]) {
		double radius; 
		double area;
		//Find radius of circle
		radius = 10;
		//Compute area of circle
		area = radius * radius * 3.142;
		//Display the area to console
		System.out.println("The area of the circle with radius " + radius + " is " + area);
	}
}
