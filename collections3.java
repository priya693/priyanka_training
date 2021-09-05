package assgn6;

import java.util.*;

class Employee
{
	int id;
	String name;
	String dept;
	int salary;
	
	Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String toString()
	{
		return this.id+" : "+this.name+" | "+this.dept+" | "+this.salary;
	}
}

public class collections3 {

	public static void main(String[] args) {
		TreeSet<Employee> q=new TreeSet<Employee>(new FirstComparator());
		
		q.add(new Employee(1,"aman","CSE",25000));
		q.add(new Employee(2,"man","IT",95000));
		q.add(new Employee(3,"priya","EEE",85000));
		q.add(new Employee(4,"sai","ECE",55000));
		q.add(new Employee(5,"sou","Mech",75000));
		q.add(new Employee(6,"san","Pharmacy",45000));
		q.add(new Employee(7,"suppu","civil",15000));
		q.add(new Employee(8,"shiv","BME",35000));
		q.add(new Employee(9,"raj","Marketing",65000));
		
		TreeSet<Employee> q2=new TreeSet<Employee>(new SecondComparator());
		
		q2.add(new Employee(1,"aman","CSE",25000));
		q2.add(new Employee(2,"man","IT",95000));
		q2.add(new Employee(3,"priya","EEE",85000));
		q2.add(new Employee(4,"sai","ECE",55000));
		q2.add(new Employee(5,"sou","Mech",75000));
		q2.add(new Employee(6,"san","Pharmacy",45000));
		q2.add(new Employee(7,"suppu","civil",15000));
		q2.add(new Employee(8,"shiv","BME",35000));
		q2.add(new Employee(9,"raj","Marketing",65000));
		
		TreeSet<Employee> q3=new TreeSet<Employee>(new ThirdComparator());
		
		q3.add(new Employee(1,"aman","CSE",25000));
		q3.add(new Employee(2,"man","IT",95000));
		q3.add(new Employee(3,"priya","EEE",85000));
		q3.add(new Employee(4,"sai","ECE",55000));
		q3.add(new Employee(5,"sou","Mech",75000));
		q3.add(new Employee(6,"san","Pharmacy",45000));
		q3.add(new Employee(7,"suppu","civil",15000));
		q3.add(new Employee(8,"shiv","BME",35000));
		q3.add(new Employee(9,"raj","Marketing",65000));
		
		
		TreeSet<Employee> q4=new TreeSet<Employee>(new FourthComparator());
		
		q4.add(new Employee(1,"aman","CSE",25000));
		q4.add(new Employee(2,"man","IT",95000));
		q4.add(new Employee(3,"priya","EEE",85000));
		q4.add(new Employee(4,"sai","ECE",55000));
		q4.add(new Employee(5,"sou","Mech",75000));
		q4.add(new Employee(6,"san","Pharmacy",45000));
		q4.add(new Employee(7,"suppu","civil",15000));
		q4.add(new Employee(8,"shiv","BME",35000));
		q4.add(new Employee(9,"raj","Marketing",65000));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Run:");
		System.out.println("-------------");
		System.out.println("1 : ID");
		System.out.println("2 : Name");
		System.out.println("3 : Department");
		System.out.println("4 : Salary");
		System.out.println("-------");
		System.out.println("your Choice");
		
		String input=sc.nextLine();
		
		if(input.equals("1"))
		{
			for(Employee e:q)
			{
				System.out.println(e);
			}
		}
		
		else if(input.equals("2"))
		{
			for(Employee e:q2)
			{
				System.out.println(e);
			}
		}
		
		else if(input.equals("3"))
		{
			for(Employee e:q3)
			{
				System.out.println(e);
			}
		}
		
		else if(input.equals("4"))
		{
			for(Employee e:q4)
			{
				System.out.println(e);
			}
		}
		sc.close();
	}

}

class FirstComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.id<e2.id)
		{
			return -1;
		}
		else if(e1.id>e2.id)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
}

class SecondComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return(e1.name).compareTo(e2.name);
	}
}

class ThirdComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return(e1.dept).compareTo(e2.dept);
	}
}

class FourthComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.salary<e2.salary)
		{
			return -1;
		}
		else if(e1.salary>e2.salary)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}