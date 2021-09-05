package assgn;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element");
        for (int i = 0;i<n-1;i++)
        {
            for (int j = 0;j <n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {

                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i:a)
        {
            System.out.println(i);
        }
  


}

}
