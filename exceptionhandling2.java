package assgn4;

import java.util.Scanner;

public class exceptionhandling2 {

	public static void main(String[] args) {
	 try {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter first number :");
		 int a=sc.nextInt();
		 System.out.print("Enter second number :");
		 int b=sc.nextInt();
		 int result;
		 if(b==0)
		 {
			 throw new UnsupportedOperationException();
		 }
		 result=a/b;
		 System.out.print("result is: "+result);
		 sc.close();
		 
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Denominator is Zero");
		 System.out.println(e);
	 }

	}

}
