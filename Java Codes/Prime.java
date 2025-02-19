import java.util.Scanner;

class Prime
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		if (isPrime(num))
			{System.out.println("Number " + num + " is Prime.");}
		else
			{System.out.println("Number " + num + " is not Prime.");}
		scanner.close();
	}
	
	
	public static boolean isPrime(int num)
	{
		if (num <=1)
			{return false;}
		else
		{
			for (int i=2 ; i <= num/2 ; i++)
			{
				if (num%i==0)
				{return false;}
			
			}
			return true;
			
		}
	}
}