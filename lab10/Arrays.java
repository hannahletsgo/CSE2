//Hannah Leskow
//Lab 10: Average (Arrays)
//October 30, 2015

//import Scanner class
import java.util.Scanner; 

//import Random class
import java.util.Random;

public class Arrays{
	
	//main method
	public static void main(String[] args) {
		double sum = 0; //declare and initialize sum
		double average = 0; //declare and initialize average
		
		Random rand = new Random(); //declare Random class
		
		//declare Scanner
		Scanner myScanner = new Scanner(System.in);
				
		//prompt user input
		System.out.println("Enter a number of values to be stored: ");
		int n = myScanner.nextInt(); //accept user input value
		
		int[] arr = new int[n]; //declare and construct array
		
		//for loop to initialize the array with n Random numbers
		for(int i = 0; i < n; i++) {
			//each value in array is a random number between 0 and 100
			arr[i] = rand.nextInt(101); 
		}
		
		//for loop to print all the values
		for(int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		//for loop to sum all the values and get the average
				for(int i = 0; i < n; i++) {
					sum = sum + arr[i]; //calculate the sum
					average = sum/n; //calculate the average
				}
				//print the answers
				System.out.println("The sum is: " + sum);
				System.out.println("The average is: " + average);
		
		//for loop to print the values greater than or equal to average
				for(int i = 0; i < n; i++) {
					if(arr[i] >= average) { //if value >= average
						//print the value
						System.out.println("The values greater than or equal to the average are: " + arr[i]);
					}
				}
	} //end main method

} //end class