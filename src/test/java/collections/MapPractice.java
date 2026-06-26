package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	
	public static void main(String[] args) {
		// map is datastructure used in key value pair 
		
		 Map<Integer, String> m = new Hashtable<Integer, String>(); 
		 
		 m.put(1,"dinesh");
		 m.put(2, "kavya");
		 m.put(3, "harsha");
		 m.put(4, "sk");
		 m.put(5, "kavya");
		 m.put(6, "Kavya");
		 
		 
		 
		         Set<Integer> key= m.keySet();
		         for (Integer keys : key)
		         {
		        	 System.out.println(keys +"----" + m.get(keys));
		         }
		 
		Collection<String> values =m.values();
		
		for ( String value : values)
		{
			
			System.out.println(value);
		}
		
		System.out.println(m.get(6));
	}
	

	

		
	}


