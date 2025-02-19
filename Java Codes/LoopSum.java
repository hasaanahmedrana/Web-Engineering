import java.util.Scanner;
class LoopSum
{	
	int count = 0;
	public void solve(){
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.print("Please Enter Value : ");
			int num1 = scanner.nextInt();
			if (num1 == -1)
				{break;}
			System.out.print("Please Enter Value : ");
			int num2 = scanner.nextInt();
			count ++;
			System.out.println("Sum is: " + (num1 + num2));

			
		}
		System.out.print("Total number of inputs : " + count);
		scanner.close();

	}
}

class Run{
	public static void main(String[] args){
		LoopSum calculator = new LoopSum();
		calculator.solve();
	}
}