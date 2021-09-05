package assgn;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m1,m2,m3;
	        Scanner sc=new Scanner(System.in);
	        m1=sc.nextInt();
	        m2=sc.nextInt();
	        m3=sc.nextInt();
	        if(m1>60&&m2>60&&m3>60)
	        {
	          System.out.println("Passed");  
	        }
	        else if(m1>60&&m2>60&&m3<60)
	        {
	            System.out.println("Promoted");
	        }
	         else if(m2>60&&m3>60&&m1<60)
	        {
	            System.out.println("Promoted");
	        }
	         else if(m3>60&&m1>60&&m2<60)
	        {
	            System.out.println("Promoted");
	        }
	         else if(m1>60&&m2<60&&m3<60)
	        {
	            System.out.println("Failed");
	        }
	         else if(m2>60&&m1<60&&m3<60)
	        {
	            System.out.println("Failed");
	        }
	         else if(m3>60&&m2<60&&m1<60)
	        {
	            System.out.println("Failed");
	        }
	         else if(m1<60&&m2<60&&m3<60)
	        {
	            System.out.println("Failed");
	        }


	}

}

