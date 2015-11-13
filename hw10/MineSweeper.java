//Hannah Leskow
//MineSweeper
//HW 10
// 11.12.2015

	import java.util.Scanner; //import Scanner class
	import java.util.Arrays;
	import java.util.Random; //import Random class

	public class hw10again {
			
		//method to sort arrays
		public static int[] sort(int[] coord) {
			//start at last int and go backwards through array
			for (int i = (coord.length - 1); i >= 0; i--) {
				  //start at position 1
			      for (int j = 1; j <= i; j++) {
			    	 //if int in value j-1 is greater than int in j 
			         if (coord[j-1] > coord[j]) {
			        	 //switch the ints in positions j and j-1
			              int change = coord[j-1]; //make new array with j-1 in that position
			              coord[j-1] = coord[j];  //move int j-1 into spot j
			              coord[j] = change; //put j in position of j-1
			         } //end if 
			      } //end j for loop
			   } //end i for loop
			return coord; 
		} //end method sort
		
		//method to print the board w/o mines
		public static void print(int n) {
			char[][] arr = new char[n][n]; //declare and construct array for board
		for(int i = 0; i <n; i++) { //1st dimension
			for(int j = 0; j < n; j++) { //2nd dimension
					arr[i][j] = 'x'; //assign a char to each value in array
					System.out.print(arr[i][j] + "\t"); //print the value
			} //end inner for loop
			System.out.println(" "); //print a space
		} //end outer for loop
		} //end print method
		
		//method to print the array with mines
		public static char[][] printMines(int n, int M, int[] sortedX, int[] sortedY) {
			int count = 0; //initial count of mines planted
			int i; 
			int j;
			char[][] arr = new char[n][n]; //new array for board that contains mines
			do { //do this loop
			int x = sortedX[count]; //take first x value from sortedX array
			int y = sortedY[count]; //take first y value from sortedY array
			
			for(i = 0; i <n; i++) { //1st dimension
				for(j = 0; j < n; j++) { //2nd dimension
					
					if(i != 0 && j != 0) { //if x and y do not equal 0
					if(arr[i-1][j-1] == 'M') { //if previous member is 'M'
						if(count != M) {
					x = sortedX[count]; //get the next x value
					//System.out.println("next x" + x);
					y = sortedY[count]; //get the next y value
						}
						else{arr[i][j] = 'x';}
					if(sortedX[count] == sortedX[count-1] || sortedY[count] == sortedY[count-1] ) {
						x = x - 1; 
						y = y - 1;
						
					}
					else{ x = x; y = y;} //else keep same x/y values
					
					//System.out.println("next y" + y);
					} //end inner if
					else{ x = x; y = y;} //else keep same x/y values
					} //end outer if
					else{ x = x; y = y;} //else keep same x/y value
									
					if(i == x && j == y) { //if i = x and j = y
						if(M != 0) { //if M is not equal to 0
						arr[i][j] = 'M'; //make the value of this member 'M'
						count++;
						//System.out.println("count =" + count);
						} //increment the count
						else if(sortedX[count] == sortedX[count-1] || sortedY[count] == sortedY[count-1] ) {
							arr[i+1][j] = 'M'; //make the value of this member 'M'
							count++;
						}
						
						else {arr[i][j] = 'x';} //otherwise value is 'x'
					}
					
					else{
						arr[i][j] = 'x';} //otherwise value is 'x'
					

					System.out.print(arr[i][j] + "\t");
				} //end inner for loop
				System.out.println(" ");
			} //end outer for loop'
			
			if(i == n) {break;}
			}while(count < M); //end while loop
			System.out.println("exited while loop");
			
			
			System.out.println("count =" + count);
			return arr;
		} //end method

		//print the numbers surrounding the mines
		public static void printNums(char[][] arr, int n) {
			System.out.println("Entered printnums");
			for(int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					
					if(arr[i][j] == 'M') {
						for(int x = i-1; x <= i + 1; x=x+1) {
						for(int y = j-1; y <= j + 1; y=y+1) {
							//System.out.println("Entered for loop");
							if(x >= 0 && y >= 0) {
								//System.out.println("Entered if loop");
							if(arr[x][y] == 'M') {arr[x][y] = 'M';}
							else if(arr[x][y] == 'x') {arr[x][y] = '0';}
							else if(arr[x][y] == '0') {arr[x][y] = '1';}
							else if(arr[x][y] == '1') {arr[x][y] = '2';}
							else{arr[x][y] = 'x';}
							System.out.print(arr[x][y] + "\t");
							}	
							//if(x >= 0 && y >= 0) {
								//System.out.println("only print in bounds!");
								//System.out.print("first x");
							//System.out.print(arr[x][y] + "\t"); 
							//}
							//else{break;}
						}
						//if(j==n-1) {
						System.out.println(" "); //}
						
					}//end if
					}
					
					else{
					System.out.print(arr[i][j] + "\t"); }
					
					//if(j == n) {System.out.println(" ");}
					if(i == n && j == n) {break;}
				}
				
				}
			
			
		return;
		}//end method
		

		public static void main(String[] args) {
			int i = 0; 
			int j = 0;
			int x = 0;
			int y = 0;
			int M = 0;
			
			//declare and construct Scanner
			Scanner scan = new Scanner(System.in);
			
			
			//prompt user for input of board size
			System.out.println("Enter an board size between 2 and 30: ");
			int n = scan.nextInt(); //accept user input of board size			
			print(n);
			
			System.out.println("Enter the number of mines (between 1 and board size): ");
			M = scan.nextInt(); //accept user input of number of mines
			
			
				Random rand = new Random(); //declare Random class
				
				int[] arrX = new int[M]; //array for x coords of mines
				int[] arrY = new int[M]; //array for y coords of mines
				for(int k = 0; k < M; k++) { //go thru both arrays
					arrX[k] = rand.nextInt(n); //get random coords for x's
					arrY[k] = rand.nextInt(n); //get random coords for y's
				}
				int[] sortedX = sort(arrX); //sort the array of x coords
				System.out.println("Sorted X array: " + Arrays.toString(sortedX));
				int[] sortedY = sort(arrY); //sort the array of y coords
				System.out.println("Sorted Y array: " + Arrays.toString(sortedY));
							
			char[][] arr = printMines(n, M, sortedX, sortedY); //call printMines method
			printNums(arr, n);
			System.out.println("done!");
				
		} //end main method
	} //end class
