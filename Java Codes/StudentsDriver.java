//Hometask2 Task1 Driver
import java.util.*;
class StudentsDriver{
	public static void main(String args[]){
		Students[] arr = new Students[5];
		for (int i=0; i<5; i++){
			arr[i] = new Students();
			arr[i].inputData();
			arr[i].showData();
			
		}
	}
}