//Hannah Leskow
//Lab 03
//September 11, 2015
//Check Program

//A group goes out to dinner and wants to split the check
//Use Scanner class to obtain from the user: orginal cost of check, percentage tip, and
//number of ways the check will be split
//Then determine how much each person needs to spend

//Import the scanner
import java.util.Scanner; 

//define a class
public class Check{
    //main method required for every Java program
    public static void main(String[] args) {
        
        //declare an instance of Scanner object and call the Scanner constructor
        Scanner myScanner = new Scanner( System.in ); //now ready to accept input from STDIN
        
        //prompt user for original cost of check
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble(); //accept user input of original cost of check
        
        //prompt user for tip percentage they wish to pay
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble(); //accept user input of percentage tip
        tipPercent /= 100; //we want to convert the percentage to a decimal value
        
        //prompt user for number of people that went to dinner
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt(); //accept user input of number of dinner guests
        
        //initialize the output variables
        double totalCost;
        double costPerPerson;
        int dollars; //whole dollar amount of cost
        int dimes;   //for storing digits
        int pennies; //to the right of the decimal point
        
        //perform calculations for costs$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        dollars = (int) costPerPerson; //get the whole amount, dropping decimal fraction
        dimes = (int) (costPerPerson * 10) % 10; //get dimes amount, where % returns remainder
        pennies = (int) (costPerPerson * 100) % 10;
        
        //print the final output
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
        
        
        
    } //end of main method
} //end of class