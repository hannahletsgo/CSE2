//Hannah Leskow
//November 20, 2015
//Lab 13: Rectangle
//Use non-static methods to print the area of a rectangle

public class Rectangle {

	//Declare two non static global variables width and height
		double width;
		double height;
	
		//non static method to set value of width
	public void setWidth(double x) { 
		width = x;
	}
	
	//non static method to set value of height
	public void setHeight(double y) { 
		height = y;
	}
	
	//non static method to return area of the rectangle
	public double getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(); //declare variable of type Rectangle
		r1.setHeight(5.3); //initialize height
		r1.setWidth(7.3); //initialize width
		System.out.println(r1.getArea ()); //print area
		
	} //end main method
	
	} //end class