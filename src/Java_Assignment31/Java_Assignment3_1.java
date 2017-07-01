package Java_Assignment31;
/*
 * This class will help to master the scope of variable
 * 
 * Write a program in java to differentiate between instance variables and class variables. 
 * And also show the scope of each.
 */

public class Java_Assignment3_1 
{


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Product FirstProduct=new Product(); // First object of the class Product  
		FirstProduct.bcode1=98765;// instance variable initialization for First object
        
        Product SecondProduct=new Product(); // Second object of the class Product
        SecondProduct.bcode1=123456; // instance variable initialization for Second object
        
        Product.bcode2=67899;//class variable initialization without creating object -- only once
         
         //Displaying First object details
         System.out.println("Instant variable value of First object: "+FirstProduct.bcode1);
         System.out.println("class variable value through First object: "+FirstProduct.bcode2);
         System.out.println(" ");
         
       //Displaying Second object details
         System.out.println("Instant variable value of Second object: "+SecondProduct.bcode1);
         System.out.println("class variable value through Second object: "+SecondProduct.bcode2);
         System.out.println(" ");
         
       //Displaying class variable value
         System.out.println("Independently accessing class variable value: "+ Product.bcode2);

	}

}

class Product
{
    public int bcode1; //instance  variable
    public static int bcode2; //Class  variable declared as static for a single initialization
   
}
