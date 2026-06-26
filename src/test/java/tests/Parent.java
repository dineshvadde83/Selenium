package tests;

 public class Parent {
	
	int a =10;
	String b ="kavya";

	
	Parent covariant()
	{
		System.out.println("covariant parent");
		return new Parent();
	}
	
	
	 Parent() {
	
    System.out.println("parent");	
    
	}
	 

	 Parent(int a) {
	
    System.out.println("parameter parent");	
    
	}
	
	String parent1(String name)
	{
		System.out.println(name);
		return name ;
	}
	
	public void grandparent()
	{
		System.out.println("grandparent");
	}
	public void grandparent1()
	{
		System.out.println("grandparent1");
	}


	void parent() {
		// TODO Auto-generated method stub
		
	}
}

