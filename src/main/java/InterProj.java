

import java.util.*;

interface student1age  {
	public void age(int age);
	
}
interface student1name extends student1age{
	public void name(String name);
	
}


public  class InterProj implements student1name {
	
	public void age(int age ) {
		Scanner Hel = new Scanner(System.in);
		System.out.println("enter age ");
		 age = Hel.nextInt();
		
		 
	}
	public void name(String name)
	{ 
		Scanner Key = new Scanner(System.in);
		System.out.println("enter your name ");
	     name = Key.nextLine();
	     System.out.println("the name of student is" + name);
		
	}
	
	
	public static void main(String Args[])
	{
		student1name output = new InterProj();
               output.name("lovely");
               output.age(15);

	}
		
		
}
