//Hannah Leskow
//HW 06
//October 6, 2015

//ask user what size pyramid they want to display
//and print a scalable pyramid

import java.util.Scanner; //import Scanner class

public class pyramid{
    
    public static void main(String[] args) {
        
        //declare and construct Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for input
        System.out.println("What size pyramid? ");
        int pyramidSize = myScanner.nextInt(); //accept user input
        
            //create counter for pyramid
        	for(int i=0; i < pyramidSize; i++) { //number of pyramid rows
			
	            for(int j=0; j < pyramidSize - i ;j++) { //number of spaces before pyramid
	                System.out.print(" ");
	            } //end "j" for loop
	         
	            for(int k=0; k <= 2*i; k++) { //number of asterisks
	                System.out.print("*");
	             } //end "k" nested for loop
	        
	        System.out.println();  //go to next line
	        } //end "i" nested for loop
    
    } //end main method
} //end class