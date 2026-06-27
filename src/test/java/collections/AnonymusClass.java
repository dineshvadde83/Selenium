package collections;

public class AnonymusClass {
	
	public static void main(String[] args) {
		
		A is =new A()
				{
			     public void add()
			     {
			    	 System.out.println("UPDAATED add");
			     }
				};
				
				is.add();
				is.print();
		
		
	}

}
class A
{
	public void print()
	{
		System.out.println("print");
	}
	public void add()
	{
		System.out.println("add");

	}
}


