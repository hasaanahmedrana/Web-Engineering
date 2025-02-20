import java.util.Scanner;
class Calculator
{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Please Enter Value : ");
	int num1 = scanner.nextInt();
	System.out.print("Please Enter Value : ");
	int num2 = scanner.nextInt();
	

	char op = args[0].charAt(0);
	int result = 0;
	
	if (op == '+'){
		result = num1 + num2;}
	if (op == '-'){
		 result = num1 - num2;}
	if (op == 'x'){
		 result = num1 * num2;}
	if (op == '/'){
		result = num1 / num2;}
	if (op == '%'){
		result = num1 % num2;}
	System.out.println("Result :" + result);
	scanner.close();
	}
}