package collections;

import java.util.ArrayList;
import java.util.Collections;

import collections.Innerclass.Innerclass1;

public class ALpractice  {
	
	ALpractice getmethd()
	{
		System.out.println("ALpractice");
		return new ALpractice();
	}

	public static void main(String[] args) {
      
		Innerclass1 in =new Innerclass().new Innerclass1();
		in.addInnerclass1();
		ArrayList<Integer> a1 = new ArrayList<>();
		System.out.println(a1.size()); // 0 
		a1.add(2);
		a1.add(5);
		a1.add(10);
		System.out.println(a1.size());
		
		
		
		// default capacity is 0 when object is created for the vector if we print the size without adding any elements it will be 10 
		// intial capacity is 10  when object is created for the vector if we print the size with adding of equal or less than 10 it will be 10 
		// arraylist has size not capacity
	    // vector has size and capacity
		// is sychronized ,thread safe-No it can handle multiple things at a time and performance high but it makes mistakes in data validations 
		// so we have make is synchonized explictly by using 
		
		Collections.synchronizedList(a1);
		System.out.println(a1);

	}

}
