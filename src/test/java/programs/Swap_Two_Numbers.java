package programs;

import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {

		 try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			 int num2 = sc.nextInt();
			 
			 System.out.println("Num1 "+ num1);
			 System.out.println("Num2 "+ num2);
			 
			 num1 = num1 + num2;
			 num2 = num1 - num2;
			 num1 = num1 - num2;
			 
			 System.out.println("Num1 "+ num1);
			 System.out.println("Num2 "+ num2);
		}

		
	}

}
