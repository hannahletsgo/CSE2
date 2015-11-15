//Hannah Leskow
//October 9, 2015
//Lab 07: Nested Loop

//ask user for input of array size and index number
//use try catch to catch errors if size is < 0 or index is invalid
//if valid, move value at the index to the end of the array

import java.util.Scanner; //import Scanner class
import java.util.Arrays;
import java.util.Random; //import Random class
public class move_array {

	public static void main(String[] args) {
		Random rand = new Random(); //declare Random class
		Scanner scan = new Scanner(System.in); //declare and construct Scanner class
		
		//prompt and accept user input of array size
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		
		//create an array of that size
		int[] arr = new int[size];
		//initialize the array w random numbers between 0 and 100
		for(int i = 0; i < size; i++) {
			arr[i] = rand.nextInt(101);
		}
		
		try{ //check if array size is > 0
			arr[size-1] = 1;
		}
		catch(Exception e) { //if not valid, display error message
			System.out.println("invalid array size" + e);
		}

		//prompt and accept user input of index number
		System.out.println("Enter an index");
		int index = scan.nextInt();
		
		try{ //check if user index is valid
			arr[index] = 1;
		}		
		catch(Exception e) { //if not valid, display error message
			System.out.println("invalid index --" + e);
		}
		
		//create array output
		int[] output = new int[size];
		//create array temp to store value at index
		int[] temp = new int[1];
		temp[0] = arr[index];
		System.out.println(Arrays.toString(arr)); //print array
		
		for(int i = 0; i < size; i++) {
		if(i < index) { //if position of value in array is less than index
			output[i] = arr[i]; //keep same value in array
			
			} 
		else if(i >= index && i < size -1) { //if position is index
			output[i] = arr[i + 1]; //move next number into position
		}

		else
		output[size-1] = temp[0]; //final number is the number from index
		
		}//end for loop
		
		System.out.println(Arrays.toString(output)); //print array	

	} //end main method

} //end class