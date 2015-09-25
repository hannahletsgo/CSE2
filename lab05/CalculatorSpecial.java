//Hannah Leskow
//September 25, 2015
//Lab 05
//Calculator Special Program

//Change calculator program from lab 4
//prompt user for two integers a and b and operator *, -, +, or /
//display "illegal operator" if invalid operator
//compute and display a+b, a-b, a*b, a/b
//keep asking for input until user input n or N

//import Scanner class
import java.util.Scanner;

public class CalculatorSpecial {
    
    //import main method
    public static void main(String[] args) {
        
        //declare and construct Scanner
        Scanner myScanner = new Scanner(System.in);
        
        String Y = "Y"; //declare Y and assign initial arbitrary value 
        
        while (!Y.equals("n") || !Y.equals("N")) { //go through loop while Y doesn't equal n or N
            
        System.out.print("Enter an integer a: "); //prompt user for input of integer a
        double a = myScanner.nextInt(); //accept user input
        
        System.out.print("Enter an integer b: "); //prompt user for input of integer b
        double b = myScanner.nextInt();
        
        System.out.print("Enter an operator +, -, *, or / :"); //prompt user for input of operator
        String operator = myScanner.next(); 
        
        //use switch/case statements to implement correct operator
        switch(operator) {
            case "+": //tests for operator '+'
                double c = a + b; //calculate a + b and save as c
                System.out.println("a + b = " + c); //display the calculation and answer
                break; //stop printing cases
                
            case "-": //tests for operator '-'
                double d = a - b;
                System.out.println("a - b = " + d);
                break;
                
            case "*": //tests for operator '*'
                double e = a * b;
                System.out.println("a * b = " + e);
                break;
                
            case "/": //tests for operator '/'
                double f = a / b;
                System.out.println("a / b = " + (double) f);
                break;
                
            default: //if none of the cases are used
                System.out.println("Illegal operator"); //print if illegal operator is entered
        
            
        } //end switch statement
        
        System.out.println("Type n or N to stop"); //ask user for input n or N
        Y = myScanner.next(); //read user input
        
        
    } //end while loop 
        
        
        
        
    } //end main method
} //end class