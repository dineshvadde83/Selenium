package programs;

import java.util.Scanner;

public class Reverse_Number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rev =0;
		int temp=0;
		
		while(num>0)
		{
			temp = num%10;
			rev = temp*1+temp*0;
		    num=num/10;
			System.out.print(rev);


		}

	}
	

}
