//Hannah Leskow
//October 16, 2015
//Lab 08: Methods

//call 3 methods from main method
//a method that calculates the mean
//a method to calculate the median
//a void print method to print the results

//import Scanner class
import java.util.Scanner;

public class Methods{
    
    public static void main(String[] args) {
        //declare Scanner
        Scanner myScanner = new Scanner(System.in);
        
        double total = 0; //declare and initialize total
        double input; //declare input
        double x = 0; //declare and initialize x
        double y = 0; //declare and initialize y, the 6th number
        
        //take in 10 user input numbers
        for(int i = 1; i <= 10; i++) {
        //prompt user for input of a number
        System.out.print("Enter a number: ");
        input = myScanner.nextDouble(); //accept user input
        total = total + input; //calculate total
        
        //set x equal to the 5th number
        if(i == 5) {
            x = input;
        }//end if statement
        
        //set x equal to the 6th number
        if(i == 6) {
            y = input;
        }//end if statement
        }//end for loop
        
        //call method calcMean
        double mean = calcMean(total); 
        //call method calcMedian
        double median = calcMedian(x, y);
        //call method print 
        print(mean, median);

    }
    
    //method calcMean calculates the mean
    public static double calcMean(double total) {
    double mean; //declare mean inside this method
    mean = total/10; //calculate the mean
    return mean; //return mean to main method as output
    }
    
    //method calcMedian calculates the median
    public static double calcMedian(double x, double y) {
        double median; //declare median inside this method
        median = (x + y)/2; //calculate the median
        return median; //return median to main method as output
    }
    
    //method print prints the results
    public static void print(double mean, double median) {
    System.out.println("The mean is " + mean);
    System.out.println("The median is " + median);
	}


}//end class
