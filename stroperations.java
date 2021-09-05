package assgn3;

public class stroperations {

	public static void main(String[] args) {
		String s1="Java String pool refers to collection of strings which are stored in heap memory";
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);
		String s1upper=s1.toUpperCase();
		System.out.println(s1upper);
		String replaceString=s1.replace('a', '$');
		System.out.println(replaceString);
		System.out.println(s1.contains("collection"));
		String s2="Java String pool refers to collection of strings which are stored in heap memory";
		System.out.println(s1.compareTo(s2));

	}

}
