//Hannah Leskow
//HW 05
//October 1, 2015

//Use while statement to write program that
//continuously requests a grade to be entered
//if < 0 or > 100, output 'invalid grade.'
//create variable to store total of grades
//when 999 is entered, program exists loop and computes
//and displays average of valid grades entered

import java.util.Scanner; //import scanner

public class averageGrade {
     
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declare and construct Scanner
        
        double sumGrades = 0; //declare and initialize the sum
        int count = 0; //declare and initalize counter for number of grades entered
        double grade; //initialize variable grade
        
        do{
            //get user input
            System.out.println("Enter a grade between 0 and 100: ");
            grade = myScanner.nextInt(); //store user input
            
            if(grade < 0 || grade > 100) { 
                System.out.println("Invalid grade"); //invalid grade
            }
            
            else {
            sumGrades = sumGrades + grade; //add grade to total
            count++; //increment counter
            }
            
        }while(grade != 999); //exit loop when user types 999
        
        double averageGrade = sumGrades/count; //declare and initialize the average
        System.out.println("The average of the grades is: " + averageGrade); //output
        
    }
}