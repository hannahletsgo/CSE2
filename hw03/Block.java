//Hannah Leskow
//hw03, program 2
//September 15, 2015

//prompt user for length, width, and height of a block
//then calculate the volume of the block and surface area

//import the Scanner
import java.util.Scanner;

public class Block {
    
    //create main method
    public static void main(String[] args) {
        
        //declare instance of Scanner object and call the Scanner constructor
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for input of variables
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble(); //accept user input
        
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        //calculate surface area and volume
        double volume = length * width * height;
        double surfaceArea = (2 * length * width) + (2 * width * height) + (2 * height * length);
        
        //print the results
        System.out.print("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume + '.');
        System.out.println(" The surface area is " + surfaceArea + '.');
        
    }
    
}