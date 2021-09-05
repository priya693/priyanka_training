package assgn6;

import java.util.*;

enum Gender
{
	Male,Female;
}

class Contact
{
	String name;
	String email;
	Gender gen;
	
	Contact(String name,String email,Gender gen)
	{
		this.name=name;
		this.email=email;
		this.gen=gen;
	}
}

public class collections1 {

	public static void main(String[] args) {
		TreeMap <Long,Contact> m=new TreeMap <Long,Contact>(Collections.reverseOrder());
		
		Contact c1=new Contact("Aman","aman123@gmail.com",Gender.Male);
		Contact c2=new Contact("Kaira","kaira321@gmail.com",Gender.Female);
		Contact c3=new Contact("Rai","rai345@gmail.com",Gender.Female);
		
		m.put(7686674325L,c1);
		m.put(9876543210L,c2);
		m.put(7689435760L, c3);
		
		System.out.println("TreeMap Keys:");
		System.out.println("--------------");
		
		for(Map.Entry<Long, Contact> map:m.entrySet())
		{
			System.out.println(map.getKey());			
		}
		System.out.println("");
		
		System.out.println("TreeMap values:");
		System.out.println("--------------");
		
		for(Map.Entry<Long, Contact> map:m.entrySet())
		{
			Contact c=map.getValue();
			System.out.println(c.name+" | "+c.email+" | "+c.gen);
		}
		System.out.println("");
		
		System.out.println("TreeMap Keys & Values:");
		System.out.println("--------------");
		
		for(Map.Entry<Long, Contact> map:m.entrySet())
		{
			Contact c=map.getValue();
			System.out.print(map.getKey()+" : ");
			System.out.println(c.name+" | "+c.email+" | "+c.gen);
			
		}
		
		

	}

}
