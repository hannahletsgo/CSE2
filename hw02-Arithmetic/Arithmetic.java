//Hannah Leskow
//HW 2
//September 8, 2015
//Arithmetic Program

//You go shopping and want to compute
//the cost of items you bought, including sales tax of 6%

//Define a class
public class Arithmetic{
    
    //Define a main method
    public static void main(String[] args) {
    
    //declare variable used for each item
    double salesTax=0.06; //PA sales tax of 6%
    
    //first calculate sock costs
        //our input data for socks
            int nSocks=3; //number of pairs of socks
        double sockCost$=2.58; //cost per pair of socks
        //('$' is part of the variable name)
        
        //declare output variables for socks
        double totalSockTax$; //tax on each pair of socks
        double totalSockCost$; //total cost of socks without tax
        double totalSockCostWithTax$; //total cost of envelopes with tax
        
        //perform calculations
        totalSockTax$=sockCost$*salesTax*nSocks;
        totalSockCost$=nSocks*sockCost$;
        totalSockCostWithTax$=(nSocks*sockCost$)+totalSockTax$;
      
        //round costs to 2 decimals       
        String totalSockCost2d$ = String.format("%.02f", totalSockCost$);
        String totalSockTax2d$ = String.format("%.02f", totalSockTax$);
        
        //print the item being bought
        System.out.println("The first item bought was socks");
        System.out.println("The number of socks purchased was "+ nSocks);
        System.out.println("The cost of each pair of socks was $"+ sockCost$);
        System.out.println("The total cost for the three pairs of socks was $"+totalSockCost2d$);
        System.out.println("The total tax on the three pairs of socks was $"+totalSockTax2d$);
        

        //now initialize and calculate glasses data
            int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //cost per glass

        
        //declare output variables for glasses
        double totalGlassTax$; //tax on each glass
        double totalGlassCost$; //total cost of glasses without tax
        double totalGlassCostWithTax$; //total cost of glasses with tax
        
        //perform calculations
        totalGlassTax$=glassCost$*salesTax*nGlasses;
        totalGlassCost$=nGlasses*glassCost$;
        totalGlassCostWithTax$=(nGlasses*glassCost$)+totalGlassTax$;
        
        //round costs to 2 decimals
        String totalGlassCost2d$ = String.format("%.02f", totalGlassCost$);
        String totalGlassTax2d$ = String.format("%.02f", totalGlassTax$);
        
        //print statements for glass data
        System.out.println("The second item bought was glasses");
        System.out.println("The number of glasses purchased was "+ nGlasses);
        System.out.println("The cost of each glass was $"+ glassCost$);
        System.out.println("The total cost for the six glasses was $"+totalGlassCost2d$);
        System.out.println("The total tax on the six glasses was $"+totalGlassTax2d$);
        
    
        //now initialize and calculate envelopes data
            int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        //declare output variables for envelopes
        double totalEnvelopeTax$; //sales tax on each box of envelopes
        double totalEnvelopeCost$; //total cost of envelopes without tax
        double totalEnvelopeCostWithTax$; //total cost of envelopes with tax
        
        //perform calculations
        totalEnvelopeTax$=envelopeCost$*salesTax*nEnvelopes;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        totalEnvelopeCostWithTax$=(nEnvelopes*envelopeCost$)+totalEnvelopeTax$;
        
        //round costs to 2 decimals
        String totalEnvelopeCost2d$ = String.format("%.02f", totalEnvelopeCost$);
        String totalEnvelopeTax2d$ = String.format("%.02f", totalEnvelopeTax$);
        
        //print statements with envelope data
        System.out.println("The third item bought was envelopes");
        System.out.println("The number of envelopes purchased was "+ nEnvelopes);
        System.out.println("The cost of each box of envelopes was $"+ envelopeCost$);
        System.out.println("The total cost for the box of envelopes was $"+totalEnvelopeCost2d$);
        System.out.println("The total tax on the box of envelopes was $"+totalEnvelopeTax2d$);
        
        
        //declare outputs for totals from all items
            double totalCost$;
        double totalSalesTax$;
        double totalCostWithSalesTax$;
        
        //perform calculations for these totals
        totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalSalesTax$=totalSockTax$+totalGlassTax$+totalEnvelopeTax$;
        totalCostWithSalesTax$=totalSockCostWithTax$+totalGlassCostWithTax$+totalEnvelopeCostWithTax$;
        
        //round costs to 2 decimals
        String totalCost2d$ = String.format("%.02f", totalCost$);
        String totalSalesTax2d$ = String.format("%.02f", totalSalesTax$);
        String totalCostWithSalesTax2d$ = String.format("%.02f", totalCostWithSalesTax$);
        
        //print the outputs
        System.out.println("The total cost of the entire purchase was $"+totalCost2d$);
        System.out.println("The total sales tax was $"+totalSalesTax2d$);
        System.out.println("The total cost of the entire purchase including sales tax was $"+totalCostWithSalesTax2d$);
    }
}