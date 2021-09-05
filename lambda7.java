package assgn8;

import java.util.*;

public class lambda7 {

	public static void main(String[] args) {
		
		Map<Integer,String> i=new HashMap<Integer,String>();
		i.put(1,"Aman");
		i.put(2, "Teju");
		i.put(3,"Amma");
		
		StringBuffer s=new StringBuffer();
		
		for(Map.Entry<Integer,String> map:i.entrySet())
		{
			s.append(map.getKey()+" : ");
			s.append(map.getValue()+"\t");
		}
		
		System.out.println(s);
			
	}

}
