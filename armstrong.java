package assgn;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int number=153;
		int check,rem,sum=0;
		System.out.println("Enter the number to be verified:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		check=number;
		while(check!=0) {
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}
		if(sum==number) 
			System.out.println("Given num is an armstrong num");
		else		
			System.out.println("Given num is not an armstrong num");
			
		}

	}

