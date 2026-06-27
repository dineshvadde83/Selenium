package collections;

public class Outerclass {
	 // local classses means a class written inside the any method or if conditons .just need brackets
	// that local class can access all elements in the outerclass methods etc but outerclass can't access it 
	 String a = "dinesh";
	
	public static void main(String[] args) {
		 
		class A {
			 
			int b = 10;
			int a = 20;
			
			int sum()
			{
				int sumofvalues =a*b;
				return sumofvalues;
			}
			
		}
		
		A as = new A();
		System.out.println(as.sum());
		
	}

}
