package singleton;

public class SingletonPractice {
	
	// private constructor - prevent object creation by using new
	// private static instance - of the same class, created inside the class
	// public static getinstance() method that always returns the same object
	
	// eager intialization means intializing the object early 
	//lazy intialization means whenever obj required it will created

	
	private static SingletonPractice s; // = new SingletonPractice();

	
	private SingletonPractice()
	{
		
	}
	 public static SingletonPractice getInstance()
	 {
		 if(s==null)
		 {
			 s= new SingletonPractice();
		 }
		 
		 return s;
	 }
	

}
