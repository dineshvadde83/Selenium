package strings;

public class Stringspractice {
	
	public static void main(String[] args) {
		
		String s1="dinesh";
		String s2=s1.concat(" vadde");
		
	    System.out.println(s1==s2);
	    int a = 10;

	    Integer n = new Integer(a);  // boxing
	    int c = n.intValue();        // unboxing
	    Integer d = a;               // autoboxing
	    int e =n;                    // auto unboxing
	    System.out.println(c);
	    
	    
	    char ch ='a';
	    
	    a=ch; // comment added in the master branch // change in the appmod/security-fix-20260626124112 branch
		
	    
	}

}
