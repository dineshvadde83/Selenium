package collections;

import java.util.Arrays;
import java.util.Vector;

//vector
public class Vpractive {

	public static void main(String[] args) {

       Vector v =new Vector();
		
		v.add("dinesh");
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10,5074558558875L);
		v.add(11);
		
		


//		System.out.println(v); // elements will print
//		System.out.println(v.size()); //12
//		System.out.println(v.capacity()); // 20 
		
		
		// adding values of one vector to another 
		
		Vector v2 =new Vector();
		v2.add("dinesh");  // add means adding only one 
		v2.add("kavya");
		v2.add("harsha");
		
	//	v.addAll(v2); // adding all element
		v.addAll(0, v2); // specifing the index to store the v2 elements
		System.out.println(v); 
		System.out.println(v.size()); // 15
		
		System.out.println(v2.get(1)); // kavya retriving the data
		System.out.println(v.remove(0)); // dinesh will deleted from list
		v.removeAll(v2);// it will remove v2 elements from v
		System.out.println(v);	
		v.set(0, "sreekanth"); // updating the existing value with another
		System.out.println(v);
		
		Object[] arr = v.toArray(); // converting into array 
		System.out.println(Arrays.toString(arr)); // printing the arrays 
		
		
		Object[] arr1 = new Object[] {"1","2","3","4"};
		Vector v3 = new Vector(Arrays.asList(arr1)); // converting arry into list now the size will be 4 not 10 because we converting into array
		
		System.out.println(v3.size()); // 4
		System.out.println(v3.capacity()); //4
		
		Vector<Integer> v4 = new Vector<>();    // <> this is called generics we have to mention type of which elements should stored 
		                                          
		v4.add(null);
		v4.add(4);
		
		
		// multi threading , data exponential 
	    // is sychronized  yes but performance slow
		// default capacity is 10 when object is created for the vector if we print the size without adding any elements it will be 10 
		// intial capacity is 10  when object is created for the vector if we print the size with adding of equal or less than 10 it will be 10 
		// 
		
		
		

		
	}

}
