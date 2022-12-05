//Largest of Three Number 
import java.util.Scanner;

class program1
{
	
	public static void main(String args[])
	
	{
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		a = scanner.nextInt();
		
		System.out.println("Enter b number: ");
		b = scanner.nextInt();
		
		System.out.println("Enter c number: ");
		c = scanner.nextInt();
		
		
		
		int max = ((a>b)&&(a>c))? a : ((b>a)&&(b>c)) ? b : c;

System.out.println("Largest number is: " + max);		
		
	
		
		
	}
}




