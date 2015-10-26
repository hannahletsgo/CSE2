//Hannah Leskow
//HW 08: Compute Area (Methods)
//October 27, 2018

//import Scanner
import java.util.Scanner;

public class areas {

	//this method takes one int for the radius of a circle
	//computes the area of the circle, and returns this value
	public static double areaCircle(int radius) {
		double area = Math.PI*radius*radius;
		return area;
	} //end method areaCircle
	
	//this method takes two ints for length and width of rectangle
	//and returns the area of the rectangle
	public static double areaRect(int length, int width) {
		double area = length*width;
		return area;
	} //end method areaRect
	
	//this method takes three ints for height, base 1, base 2
	//of a trapezoid and returns the area
	public static double areaTrap(int base1, int base2, int height) {
		double area = .5*height*(base1+base2);
		return area;
	} //end method areaTrap
	
	public static void main(String[] args) { //main method
		//initialize and declare Scanner class
		Scanner myScanner = new Scanner(System.in);
		
		double area = 0; //declare and initialize area
		
		//declare and initialize variables
		String shape = "";
		String circle = "circle";
		String rect = "rectangle";
		String trap = "trapezoid";
		String exit = "exit";	
		
		while(!shape.equals(exit)){ //while shape does not equal exit
		//prompt user input of shape
		System.out.println("Please enter a shape or type 'exit' to exit: ");
		shape = myScanner.nextLine(); //store user input
		
		if(shape.equals(circle)) { //if shape equals circle
			System.out.println("Enter the radius: "); //prompt user input of radius
			int radius = myScanner.nextInt(); //store radius
			area = areaCircle(radius); //call method areaCircle 
			System.out.println("The area of your shape is: " + area); //print area of circle
			break;
		} //exit loop
		
		else if(shape.equals(rect)) { //if shape equals rectangle
			System.out.println("Enter the length: "); //prompt user input of length
			int length = myScanner.nextInt(); //store length
			System.out.println("Enter the width: "); //prompt user input of width
			int width = myScanner.nextInt(); //store height
			area = areaRect(length, width); //call method areaRect 
			System.out.println("The area of your shape is: " + area); //print area
			break; 
		} //exit loop
		
		else if(shape.equals(trap)) { //if shape equals trapezoid
			System.out.println("Enter base 1: "); //prompt user input of base 1
			int base1 = myScanner.nextInt(); //store base 1
			System.out.println("Enter base 2: "); //prompt user input of base 2
			int base2 = myScanner.nextInt(); //store base 2
			System.out.println("Enter the height: "); //prompt user input of height
			int height = myScanner.nextInt(); //store height
			area = areaTrap(base1, base2, height); //call method areaTrap
			System.out.println("The area of your shape is: " + area); //print area
			break; //exit loop
		}
				
		
		} //end while loop
		
		System.exit(0); //terminate program
		
} //end main method
	
} //end class
