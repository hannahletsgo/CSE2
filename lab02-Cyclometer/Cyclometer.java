//Hannah Leskow
//Lab 02
//September 4, 2015
//Cyclometer Program

//Bicycle cyclometer records 2 types of data
    //Time elapsed in seconds and
    //Number of rotations of front wheel during that time
    
//Define a class  
public class Cyclometer{
    
    //main method required for every Java program
    public static void main(String[] args){ 
        
        //our input data
        int secsTrip1=480; //time of trip 1 in seconds
        int secsTrip2=3220; //time of trip 2 in seconds
        int countsTrip1=1561; //number of rotations of wheel for trip1
        int countsTrip2=9037; //number of rotations of wheel for trip2
        
        //useful constants
        double wheelDiameter=27.0; //define diameter of wheel
        double PI=3.14159; //define PI
        double feetPerMile=5280; //5280 feet in one mile
        double inchesPerFoot=12; //12 inches in one foot
        double secondsPerMinute=60; //60 seconds in one minute
        
        //create variables for distance traveled for
        //trip1, trip2, and the total distance traveled
        double distanceTrip1;
        double distanceTrip2; 
        double totalDistance; 
        
        //print statement for number of seconds and counts
        //for trip1 and trip2
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
        //run the calculations; store the values
        

        //Below converts distance from inches to feet to miles
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
            //Gives distance of trip1 in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            //Gives distance of trip2 in miles
        totalDistance=distanceTrip1+distanceTrip2;
            //Give total distance of combined trips 
        
            //Print out the output data
        System.out.println("Trip 1 was "+(distanceTrip1)+"miles");
        System.out.println("Trip 2 was "+(distanceTrip2)+" miles");
        System.out.println("The total distance was "+(totalDistance)+" miles");
        
        
        
        
        
        
        
        
    } //end of main method
} //end of class