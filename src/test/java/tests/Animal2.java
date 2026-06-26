package tests;

public interface Animal2  {
	
	void play2();
	
	void fight2();
	
	void eat();
	
    default void eat2 ()
    {
    	System.out.println("default method");
    }
    
    static void jump2()
    {
    	System.out.println("static method in interface");
    }
	
	

}
