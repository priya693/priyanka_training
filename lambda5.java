package assgn8;

import java.util.*;

public class lambda5 {

	public static void main(String[] args) {
		List<String> f=new ArrayList<String>();
		f.add("Priya");
		f.add("Deva");
		
		StringBuffer s=new StringBuffer("");
		
		Consumer<List<String>> d=list->
		{
			Iterator<String> i=list.iterator();
			while(i.hasNext())
			{
				String r=i.next();
				s.append(r.charAt(0));
			}
		};
		
		d.accept(f);
		System.out.println(s);
				
	}

}
