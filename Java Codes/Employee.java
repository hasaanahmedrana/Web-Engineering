import java.util.*;


class Employee{
	private String name = "John";
	private String email = "Johndoe@gmail.com";
	private double salary = 0.0;
	private String companyname = "Company1";
	
	
	public void displayinfo(){
		System.out.println("name " + name);
		System.out.println("email "+ email);
		System.out.println("salary " + salary);
		System.out.println("Company name "+ companyname);
		
		
	
	}
	
	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.displayinfo();
	}
	



}