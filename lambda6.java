package assgn8;

import java.util.*;
import java.util.function.UnaryOperator;

class Operator implements UnaryOperator<String>
{
	public String apply(String s)
	{
		return s.toUpperCase();
	}
}

public class lambda6 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("String :priya");
		a.add("String :deva");
		a.add("String :devi");
		
		System.out.println();
		
		a.replaceAll(new Operator());
		
		System.out.println("In UpperCase format");
		System.out.println("....");
		System.out.println(a);
		
	}

}
