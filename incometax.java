package assgn;

import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int ctc;
	        Scanner sc=new Scanner(System.in);
	        ctc=sc.nextInt();
	        if(ctc>0&&ctc<=180000)
	        {
	          System.out.println("Tax is"+0);  
	        }
	        else if(ctc>180000&&ctc<=300000)
	        {
	          System.out.println("Tax is"+(0.01*ctc));  
	        }
	         else if(ctc>300000&&ctc<=500000)
	        {
	          System.out.println("Tax is"+(0.20*ctc));  
	        }
	         else if(ctc>500000&&ctc<=1000000)
	        {
	          System.out.println("Tax is"+(0.30*ctc));  
	        }



		}

	}
