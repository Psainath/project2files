import java.util.ArrayList;
import java.util.Scanner;
public class Arrayhas {
	
 ArrayList<String> EmployeeName = new ArrayList <String>();
 ArrayList<Integer> EmployeeId = new ArrayList <Integer>();
 

 public void empname() {
	 

for(int i = 0 ; i<=2 ; i++)
{
	 
	 Scanner Key = new Scanner(System.in); 
	 System.out.println("enter the name");
	   String name = Key.nextLine();  
	  EmployeeName.add(name);  

}


for(String nam:EmployeeName)	
{
	System.out.println("the name of employee is    " + nam);
}
System.out.println("---------------------------------------------------------------------");

}
 
public void empid() {

	for(int i = 0 ; i<=2 ; i++)
	{
		 
		 Scanner Key = new Scanner(System.in); 
		 System.out.println("enter the age");
		  int age = Key.nextInt();  
		  EmployeeId.add(age);  
	
	}

	for(int AYEEDI:EmployeeId)	
	{
		System.out.println("the name of employee is   " + AYEEDI);
	}

	System.out.println("---------------------------------------------------------------------");
}	


		
}
	 
	 
	 










