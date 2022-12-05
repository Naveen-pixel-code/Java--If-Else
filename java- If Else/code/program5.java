/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/


import java.util.*;

class program5
{
	
	public static void main(String args[])
	{
		float total = 200;
		float a ;
		float percentage;
		Scanner s = new Scanner(System.in);
		
		System.out.println("From 200classes , Number of classes you attend?");
		a = s.nextInt();
		
		percentage = ((a/total) * 100);
		
		System.out.println( "Your Percentage of attendence is: " + percentage);
		
		if (percentage>=75)
			System.out.println("!!!!!!Your are eligible to attend  exam!!!!!!");
		else
			System.out.println("~~Sorry ~~ \n You not eligible");
		
		
	}
}