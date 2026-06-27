package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stackpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// stack extends vector 
		//Lifo - last in first out - stack
		//Fifo - first in first out -Queue
		// stack cont be  intilize size .it should be empty stack 
		//special methods available in stack
		//push - to insert the element
		//pop, - to remove the last element
		 //peek - to get last element
		//search - search in two ways 
		// with index of means it will match from bottom that is starts 0
		// with search means it will match from top that is starts from 1 
         Stack<String> b =new Stack<>();
         b.add("dinesh");
         b.add("kavya");
         b.add("sreekanth");
         b.add("harsha");
         
         // all vector methods we can use it because it extends it
         System.out.println(b); //[dinesh, kavya,sreekant,harsha]
         System.out.println(b.peek()); // harsha
         System.out.println(b.pop()); // [dinesh,kavya,sreekanth]
         System.out.println(b.push("akash")); // adding it in last 
         System.out.println(b); // [dinesh, kavya, sreekanth, akash]

         System.out.println(b.indexOf("akash")); //3
         System.out.println(b.search("AKash"));  //1
         // isempth , empty == refers to size==0
         
         // closing brackets , undo ,rendo are examples for usages
         
	}

}
