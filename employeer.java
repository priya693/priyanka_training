package assgn2;

import java.util.Scanner;

class employee {
	static int p,q,r,a,b;
	Scanner sc=new Scanner(System.in);
}
class manager extends employee {
	public void salary()
	{
		System.out.println("Incentives:p,with Salary:q");
		p=sc.nextInt();
		q=sc.nextInt();
	}
}

class labour extends employee {
	public void salary()
	{
		System.out.println("Extra money for overtime:p with Salary:q");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}

class total extends employee {
	void add()
	{
		r=p+q+a+b;
	}
	void result()
	{
		System.out.println("total salary of all employees is"+r);
	}
}

public class employeer {

	public static void main(String[] args) 
	{
		manager obj1=new manager();
		obj1.salary();
		
		labour obj2=new labour();
		obj2.salary();
		
		total obj3=new total();
		obj3.add();
		obj3.result();
		

	}

}
