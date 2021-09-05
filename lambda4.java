package assgn8;

import java.util.*;

public class lambda4 {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Aman");
		s.add("Kaira");
		s.add("Lavan");
		s.add("king");
		
		s.removeIf(v->v.length()%2!=0);
		System.out.println(s);
	}

}
