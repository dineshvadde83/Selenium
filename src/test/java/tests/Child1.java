package tests;

public class Child1 extends Parent {
	
	int c = 30;
	String chILD = "Child";
	
	
	@Override
	Child1 covariant()
	{
		System.out.println("covariant child");
		return new Child1();
		
	}
	
	@Override
	void parent()
	{
		System.out.println("childmethod");
	}
	
	void child()
	{
		System.out.println("child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Parent p =new Child1();	
		  
		  System.out.println(p.a);
		  System.out.println(p.b);
		    p.parent1("string method in parent");
		    p.parent();
		    p.covariant();

		  
		  
		  Child1 c = (Child1)p;
		  System.out.println(c.c);
		  System.out.println(c.chILD);
		  c.parent();
		  c.parent1("string method in parent");
		  c.child();
		  c.covariant();
		  System.out.println(c.a);
		  System.out.println(c.b);


		  

	}

}
