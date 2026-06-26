package tests;

public class Gchild extends Parent{
	
	
	Gchild()
	{
		super(60);
		System.out.println("gchild");
	}
	
	
	public void  data ()
	{
        super.grandparent();
		System.out.println("data");
		System.out.println(super.a);
		super.grandparent1();
	}

	public static void main(String[] args) {

		
		Gchild c =new Gchild();
		c.data();
	}

}
