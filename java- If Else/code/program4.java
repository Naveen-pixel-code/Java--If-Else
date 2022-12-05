/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/


import java.util.*;

class program4
{
	public static void main(String args[])
	
	{
		int x ;
		double discount;
		
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a Quantity: ");
		x = s.nextInt();
		
		discount = (.1*x*100);
		
		if(x*100>1000)
		{
			System.out.println("Hey!! You are eligible for Discount");
		    System.out.println("Total Quanity: " + x*100);
			System.out.println("Your Discount value is: " + discount);
			System.out.println("You can pay: " + ((x*100) - discount));
		}
		else
		{
			System.out.println("Purchase more to eligible discount");
			
		}
	}
	
}