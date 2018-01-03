import java.util.*;

public class Arryexten extends Arrayhas {
	
	
	
public void sortingname() {

		Collections.sort(EmployeeName);
		
		for(String name:EmployeeName ) {
			
			System.out.println("the sorted list of employee     " + name);
			
		}
		
		System.out.println("---------------------------------------------------------------------");

			
}
	
	
public void sortage() {
		
		
		Collections.sort(EmployeeId);	
		
        for(int ID:EmployeeId ) {
			
			System.out.println("the sorted list of employee   " + ID);
			}		
        
        System.out.println("---------------------------------------------------------------------");
 
	}



public static void main(String[] args)

{	Arryexten Emp = new Arryexten();
	Emp.empname();
	Emp.empid();
	Emp.sortage();
    Emp.sortingname();
	
}

}
