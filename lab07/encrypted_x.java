//Hannah Leskow
//October 9, 2015
//Lab 07: Nested Loop

//ask user for input of int between 0-100


//import Scanner class
import java.util.Scanner;

public class encrypted_x{
    
    public static void main(String[] args) {
        
        //declare Scanner
        Scanner myScanner = new Scanner(System.in);
        //prompt user for input of integer
        System.out.println("Enter an integer between 0 and 100");
        int input = myScanner.nextInt(); //accept user input
        
        if(input < 0 || input > 100) { //exit program if not in boundaries
            System.exit(-1);
        }
        
        for(int i = 0; i < input; i++) { //outer loop determines number of lines printed
            for(int j = 0; j < input; j++) { //inner loop determine what is printed on each line
                //print space if value is ith letter on beginning or end
                if(j == i || j == input - i - 1) {
                    System.out.print(' '); 
                }
                //else print star
                else {
                    System.out.print('*');
                }
            }
            System.out.println(); //go to next line
        }
    }
    
}