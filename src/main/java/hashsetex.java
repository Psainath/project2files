
import java.util.*;
public class hashsetex {

	
	HashSet<String> student1=new HashSet<String>();  
	HashSet<Double> student1grad=new HashSet<Double>(); 	
	HashSet<Double> student1age=new HashSet<Double>(); 
	
	public void Student1() {
		
		double age, grades ;
		String Name;
		int count= 2 ;
		
		
		for(int i =0 ;i<count;i++)
		{
			Scanner Key = new Scanner (System.in);
			System.out.println("enter you name");
			Name= Key.nextLine();
			
			System.out.println("enter your age");
			age= Key.nextDouble();
			System.out.println("enter your grades");
			grades = Key.nextDouble();
			
			student1.add(Name);
			student1age.add(age);
			student1grad.add(grades);
		}
		
for(String counter:student1)
{
		System.out.println("the name of student are :" + counter);
		
	}

for(Double A:student1age)
{
		System.out.println("the name of student are :" + A);		
}
for(Double B :student1grad)
{
		System.out.println("the name of student are :" + B);		
}

}

public static void main (String[] args)
{
	
	hashsetex obj1 = new hashsetex();	
	obj1.Student1();
 	
}

}
