package assgn5;

import java.util.Date;

public class generics4 {

	public static void main(String[] args) {
		Pair<String,String> s1=new Pair<>();
		s1.setKey("key is in string form");
		s1.setValue("Welcome");
		s1.displayDetails();
		
		
		Pair<String,Date> s2=new Pair<>();
		s2.setKey("Today");
		s2.setValue(new java.util.Date());
		s2.displayDetails();
		
		

	}

}

class Pair <T1,T2> {
	private T1 key;
	private T2 value;
	
	public void setKey(T1 key) {
		this.key=key;
	}
	public void setValue(T2 value) {
		this.value=value;
	}
	void displayDetails() {
	System.out.println(this.key);
	System.out.println(this.value);
	}
}