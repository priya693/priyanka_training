package assgn2;

import java.util.Scanner;

class bank1 {
	public int amount(int a) {
		return 0;
	}
}

class current extends bank1 {
	int a;
	public int amount(int a) {
		this.a=a;
		return a;
	}
}

class saving extends bank1{
	int a;
	public int amount(int a) {
		this.a=a;
		return a;
	}
}
public class bank {

	public static void main(String[] args) 
	{
		saving s=new saving();
		current c=new current();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter savings and current");
		int savings=sc.nextInt();
		int current=sc.nextInt();
		int sum=s.amount(savings)+c.amount(current);
		System.out.println("total cash in bank:"+sum);

	}

}
