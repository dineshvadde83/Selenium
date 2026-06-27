package collections;

public class Innerclass {
	 private int a =10;
	 
	 void addInnerClass()
	 {
		 System.out.println("addInnerClass");
	 }
	 
	 
	
	public static void main(String[] args) {
		Innerclass2 in = new Innerclass().new Innerclass2();
		in.subInnerclass2();
		
	}
	 
	 protected class Innerclass1 extends Child{
		          private int a =20;
		           
		           void addInnerclass1()
		           { 
		        	   int a = 30;
		        	   System.out.println("addInnerclass1 " +a); //30 inside focus 
		        	   System.out.println("addInnerclass1 " +this.a); //20 global variable of innerclass
		        	   System.out.println("addInnerclass " +Innerclass.this.a); //10 globle variable of outerclass
		        	   marks();

		           }

				@Override
				void data() {
					// TODO Auto-generated method stub
					
				}
		
	}
	
     class Innerclass2{
    	 
    	 int b = 20;
    	 void subInnerclass2()
    	 {
    		 Innerclass1 i1 = new Innerclass1();
    		 i1.addInnerclass1();
    	 }
		
	}

 
    
    
    
    
    
    
    
    
    
    
    
//	@Override
//	protected  void finalize()
//	{
//		System.out.println("worked");
//	}
//	
//	public static void main(String[] args) {
//		
//		Innerclass s =new Innerclass();
//		s=null;
//			System.gc();
//	}

}
