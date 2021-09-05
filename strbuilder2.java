package assgn3;

public class strbuilder2 {

	public static void main(String[] args) {
		String str="It is used to_at the specified index position";
		String newSub="Insert Text ";
		int index=13;
		StringBuilder resString=new StringBuilder(str);
		resString.insert(index+1, newSub);
		System.out.println("Resultant String="+resString.toString());


	}

}
