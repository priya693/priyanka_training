package assgn4;

import java.util.Scanner;

public class exceptionhandling1 {

	public static void main(String[] args) {
		try
		{
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number : ");
			a=sc.nextInt();
			System.out.println("Enter second number : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("result :"+c);			
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}

	}

}
