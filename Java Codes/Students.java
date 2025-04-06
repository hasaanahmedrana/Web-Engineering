import javax.swing.*;
//Hometask2 TASK1s
class Students{
	private String rollno;
	private String name;
	private String email;
	private String address;
	
	//Default Constructor 
	public Students(){
		rollno = "xyz";
		name = "abc";
		email = "def";
		address = "hkl";
	}
	
	//Parameterized Constructor
	public Students(String rollno, String name, String email, String address){
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	 // Getters
	public String getName(){
		return name;
	}
	public String getRollno(){
		return rollno;
	}
	public String getEmail(){
		return email;
	}
	public String getAddress(){
		return address;
	}
	
	//Setters
	public void setName(String name){
		this.name = name;}
	public void setRollno(String rollno){
		this.rollno = rollno;}
	public void setEmail(String email){
		this.email = email;}
	public void setAddress(String address){
		this.address = address;}
		
	public void showData(){
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollno );
		System.out.println("Email: " + email);
		System.out.println("Address "+ address);
	}
	
	public void inputData(){
		rollno = JOptionPane.showInputDialog("Enter Roll Number:");
		name = JOptionPane.showInputDialog("Enter Name:");
		email = JOptionPane.showInputDialog("Enter Email:");
		address = JOptionPane.showInputDialog("Enter Address:");		
	}
}

	