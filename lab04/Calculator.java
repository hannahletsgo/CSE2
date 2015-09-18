//Hannah Leskow
//September 18, 2015
//Lab 04
//Calculator

//Write calculator program using switch statement
//Prompt user for input of two integers a and b and operator (*,-,+,or /)
//display "illegal operator" if invalid
//compute and display a+b, a-b, a*b, or a/b

//import Scanner class
import java.util.Scanner;

public class Calculator {
    
    //import main method
    public static void main(String[] args) {
        
        //declare and construct Scanner
        Scanner myScanner = new Scanner(System.in);
        
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
        }
        
        
        
        
    } //end main method
} //end class