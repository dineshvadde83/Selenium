package tests;

public class Lion2 extends Lion1 implements Animal3  {
    
	
	public void danger3() {
    System.out.println("danger3 in class lion2");		
	}

	
	public void man3() {
	    System.out.println("man3 in class lion2");		
		
	}
	

	
	@Override
	public  void play2() {
    System.out.println("play2 second overrided in lion 2");		
	}

    public static void main(String[] args) {
    	Lion1 lion2 = new Lion2();
    	Animal3 lion = new Lion2();

    	
    	lion2.play2();
    	lion.danger3();
    	lion.man3();
    	lion.ferocius();
    	Animal3.animal3();
	}
}
