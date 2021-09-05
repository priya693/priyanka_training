package assgn;

import java.util.Scanner;

public class searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,f=1;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the size");
	        n=sc.nextInt();
	        int a[]=new int[n];
	        System.out.println("enter the values");
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        System.out.println("enter the element");
	        int x=sc.nextInt();
	        for (int i = 0; i < n; i++)
	        {
	            if (a[i] == x)
	                {
	                    f=0;
	                    break;
	                }
	        }
	        if(f==0)
	        {
	            System.out.println("Found");
	        }
	        else{
	            System.out.println("not found");
	        }
	         


	}
}
