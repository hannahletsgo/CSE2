//Hannah Leskow
//HW 3, Program 1
//September 15, 2015
//Timer

//Prompt user for current time and dinner time
//Calculate the amount of time remaining until dinner
//Use military time in form int HHMM

import java.util.Scanner;

public class Timer {
    
    //create main method
    public static void main(String[] args) {
        
        //create scanner class for user input
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for current time
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt(); //accept user input of original time
        
        //prompt user for dinner time
        System.out.print("Enter your scheduled dinner time: ");
        int dinnerTime = myScanner.nextInt(); //accept user input of dinner time
        
        //calculate the amount of time remaining until dinner
        double waitingTime = dinnerTime - currentTime; 
        
        int dinnerTimeMinutes = dinnerTime - 100 * ((int) (dinnerTime/100));
        int currentTimeMinutes = currentTime - 100 * ((int) (currentTime/100));
        
        //separate time into hours and minutes
        int waitingTimeHours = (int) waitingTime/100;
        
        if(dinnerTimeMinutes < currentTimeMinutes) {
        int waitingTimeMinutes = (dinnerTimeMinutes - currentTimeMinutes) + 60;
        //print the result
        System.out.println("You have " + waitingTimeHours + "hours and " + waitingTimeMinutes + "minutes until dinner.");
        }
        
        else{
        int waitingTimeMinutes = dinnerTimeMinutes - currentTimeMinutes;
        //print the result
        System.out.println("You have " + waitingTimeHours + "hours and " + waitingTimeMinutes + "minutes until dinner.");
        }
        
    
}
}