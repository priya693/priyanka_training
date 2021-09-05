package assgn5;

import java.util.HashSet;
import java.util.Iterator;

public class generics1 {

	public static void main(String[] args) {
		HashSet<Employee> h=new HashSet<Employee>();
		Employee e1=new Employee(1,"name1",200000,"GKRITI");
		Employee e2=new Employee(2,"emp2",200000,"Gkriti");
		Employee e3=new Employee(3,"empname3",200000,"Gkriti");
		h.add(e1);
		h.add(e2);
		h.add(e3);
		Iterator<Employee> l=h.iterator();
		for (Employee e: h) {
			e.displayDetails();
		}		

	}

}

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int id, String name,double salary,String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;		
	}
	
	void displayDetails() 
	{
		System.out.println("ID :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Salary :"+this.salary);
		System.out.println("Department :"+this.department);
		System.out.println(" ");
	}
}
