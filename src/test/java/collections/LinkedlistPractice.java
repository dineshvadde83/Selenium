package collections;

import java.util.LinkedList;

public class LinkedlistPractice extends ALpractice {
	
	@Override
	LinkedlistPractice getmethd()
	{
		System.out.println("LinkedlistPractice");
		return new LinkedlistPractice();
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		
		// capacity we can't get it by deflaut is 0 but after adding the element size will be according to that
		
		
		l.add("dinesh");
		l.add("kavya");
		System.out.println(l.size());
		
		
		LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(50);
        l1.add(20);
        l1.add(40);
        
        System.out.println(l1);
		
	
		
	}

}
