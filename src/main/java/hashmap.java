import java.util.*;
public class hashmap {
		
	HashMap<Integer,String> Student = new HashMap<Integer,String>();
	
	public void maps()
	{
		
		int count = 2 ;
		
        for(int i = 0 ; i < count ; i++)   	
        {
        	Scanner keyboard = new Scanner(System.in);
        	System.out.println("Enter your age and name");
        	      	
        	int age = keyboard.nextInt();
            String name = keyboard.nextLine();
          
            Student.put(age,name);
                 
        }
        for(Map.Entry<Integer,String> entry :Student.entrySet()) {
        	 int age = entry.getKey();
        	 String name = entry.getValue();
        
        	
        	System.out.println("the age and name of Student is :" + age +  "     " + name );
       	
     	
        }

	}
      
	
	public static void main (String[] args)
        {
        	
        	hashmap Mapping = new hashmap();	
        	Mapping.maps();
         	
        }
        
        

	
}
