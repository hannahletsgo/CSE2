//Hannah Leskow
//Lab 06
//October 2, 2015

//Ask user to enter positive integer of 
//number of employee timesheets to be read
//get user input for int pay per hour in cents
//ask for 5 ints representing # hours worked from M-F
//read/store data for total payroll of all employees

import java.util.Scanner; //import Scanner

public class timeSheets{
    
    public static void main(String[] args) {
    
    //declare and construct Scanner object
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter the number of employee timesheets to be read: ");
    int numTimesheets = myScanner.nextInt(); //get user input of # of timesheets
    
    int totalPayroll = 0; //initialize total payroll
    
    int employee = 1; //initialize employee number 1
    
    while(numTimesheets > 0) { //while positive 
        
        System.out.println("For employee " + employee + ',');
        System.out.println("Enter pay per hour in integer cents: ");
        int payPerHour = myScanner.nextInt(); //get user input of pay per hour
    
        //prompt and store user input for hours worked M-F
        System.out.println("Enter number of integer hours worked on Monday: ");
        int monHours = myScanner.nextInt();
        System.out.println("Enter number of integer hours worked on Tuesday: ");
        int tuesHours = myScanner.nextInt();
        System.out.println("Enter number of integer hours worked on Wednesday: ");
        int wedHours = myScanner.nextInt();
        System.out.println("Enter number of integer hours worked on Thursday: ");
        int thursHours = myScanner.nextInt();
        System.out.println("Enter number of integer hours worked on Friday: ");
        int friHours = myScanner.nextInt();
        
        //calculate total hours and total pay per week for one employee
        int totalHours = monHours + tuesHours + wedHours + thursHours + friHours;
        int weekPay = totalHours * payPerHour;
        totalPayroll = weekPay + totalPayroll; //total payroll for all employees
        
        numTimesheets--; //decrement count
        employee++; //increment employee number
    } //end while loop
    
    //print out total payroll
    System.out.println("The total payroll for all employees is " + totalPayroll + " cents");
    
    } //end main method
    
} //end class