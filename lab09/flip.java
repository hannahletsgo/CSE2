//Hannah Leskow
//Lab 09: Coin Flipping (Methods)
//October 23, 2015

//import Scanner class
import java.util.Scanner; 

//import Random class
import java.util.Random;

public class flip{
	
	int tail = 0; //declare and initialize tail
	int heads = 0; //declare and initialize heads
	
	//method simulates coin flip and assigns value to head or tails
	public static void flip(int tail, int heads) {
		Random rand = new Random(); //declare Random class
		int coin = rand.nextInt(2); //generates a random number 0 or 1
		if(coin == 0) { //if random number is 0
			tail = 1; //assign value 1 to tail
			heads = 0; //assign value 0 to heads
			
		}
		
		else{ //if random number is 1
			heads = 1; //assign value 1 to heads
			tail = 0; //assign value 0 to tail
		}
		//print out result
		System.out.println("Tail: " + tail + " Heads: " + heads);
	}
	
	//method takes n and calls first method to  simulate n flips of a coin
	public static void flip(int n) {
		//start at 0 and increment by 1 to get n flips
		for(int i = 0; i < n; i++) {
			flip(i, i); //call overload method flip
		}
	}
	
	//main method
	public static void main(String[] args) {
		//declare Scanner
		Scanner myScanner = new Scanner(System.in);
		
		//prompt user input
		System.out.println("Enter an integer between 0 and 100: ");
		int n = myScanner.nextInt(); //accept user input of n
		if(n<=100) { //only run program if n<= 100
		flip(n); //call method flip
		}
	}

}
