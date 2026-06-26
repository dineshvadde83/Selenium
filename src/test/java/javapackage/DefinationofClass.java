package javapackage;

import tests.override;

public class DefinationofClass extends override{
	
	//A class is a blueprint or template used to create objects. It defines properties (variables) and behaviors (methods) but does not occupy memory until an object 
	//is created from it using the new keyword.	

	
	

//	DefinationofClass() {
//		
//		System.out.println("definationofclass");
//	}
	
     DefinationofClass(int a) {
    //	 super("dinesh");
     System.out.println("value "+a);
	}

     static void name()
     {
	 System.out.println("dinesh static");
     }
     
     {
    	 System.out.println("nonstatic");
     }

	static String name;   // variable
    int id;

        protected void work() {  // method
        System.out.println("Working");
        System.out.println(name);
        duty();
         }
        
        
    
    public static void duty()
    {
    	System.out.println("duty");
    }
    
     public static void main (String args[])
    {
	// A real-world instance created from a class. - object
//	DefinationofClass d = new DefinationofClass(); // constructor 
	DefinationofClass d1 = new DefinationofClass(5); // constructor 
	

	
	
}
    
}
