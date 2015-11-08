import java.util.Random; //import Random class
import java.util.Arrays;

public class ArraySort {
	
		//method to sort arrays
		public static void sort(int[] arr) {
			//start at last int and go backwards through array
			for (int i = (arr.length - 1); i >= 0; i--) {
				  //start at position 1
			      for (int j = 1; j <= i; j++) {
			    	 //if int in value j-1 is greater than int in j 
			         if (arr[j-1] > arr[j]) {
			        	 //switch the ints in positions j and j-1
			              int change = arr[j-1]; //make new array with j-1 in that position
			              arr[j-1] = arr[j];  //move int j-1 into spot j
			              arr[j] = change; //put j in position of j-1
			         } //end if 
			      } //end j for loop
			   } //end i for loop
			System.out.println("Sorted array: " + Arrays.toString(arr)); //print the array
			return; 
		} //end method sort
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Random rand = new Random(); //declare Random class
			
			//declare and construct first array
			int[] arr1 = new int[20];
			for(int i = 0; i < 20; i++) { 	//initialize values of array 1
				arr1[i] = rand.nextInt(101); //use a random integer between 0 and 100
			}
			System.out.println(Arrays.toString(arr1)); //print array
			sort(arr1); //call method sort
			
			//declare and construct second array
			int[] arr2 = new int[10];
			for(int i = 0; i < 10; i++) { //initialize values of array 2
				arr2[i] = rand.nextInt(101); //use a random integer between 0 and 100
			}
			System.out.println(Arrays.toString(arr2)); //print array
			sort(arr2); //call method sort
			
			//declare and construct combined array
			int[] arr3 = new int[30];
			//initialize values of array 3
					for(int i = 0; i < 20; i ++) { //first twenty are from array 1
						//set each value in arr3 equal to ints in same positions from arr1
						arr3[i] = arr1[i]; 
					}
					for(int i = 20; i < 30; i ++) { //next ten are from array 2
						//set each value in positions 20-29 in arr3 equal to ints from arr2 in pos's 0-9
						arr3[i] = arr2[i-20]; 
					}
					System.out.println(Arrays.toString(arr3)); //print array
					sort(arr3); //call method sort
		} //end main method

	} //end class