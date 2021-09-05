package assgn10;

import java.util.ArrayList;
import java.util.Arrays;

public class java3 {

	public static void main(String[] args) {
		String w="A quick brown fox jumps over the lazy dog";
		
		ArrayList<String> s=new ArrayList<String>
		(Arrays.asList(w.split(" ")));
		
		System.out.println(s);
		
	}

}
