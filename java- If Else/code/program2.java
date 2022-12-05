//Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.*;

class program2
{
    public static void main(String args[])
	
	{
	           int a,b;
			   
			   Scanner s = new Scanner(System.in);
			   System.out.println("Enter a length value: ");
			   a = s.nextInt();
			   
			   System.out.println("Enter a breath value: ");
			   b = s.nextInt();
			   
			   if(a==b)
				   System.out.println("It is a Square");
			   else 
				   System.out.println("It is Rectangle");
	}
}